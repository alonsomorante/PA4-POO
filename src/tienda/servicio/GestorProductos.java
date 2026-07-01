package tienda.servicio;

import tienda.modelo.Producto;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Clase de servicio que gestiona la colección de productos de la tienda académica.
 * Incluye registro con validación de unicidad, búsquedas y ordenamiento.
 */
public class GestorProductos {

    private List<Producto> productos;
    private Set<String> codigosRegistrados;

    /**
     * Constructor que inicializa las colecciones.
     * - productos: ArrayList para almacenar los productos.
     * - codigosRegistrados: HashSet para garantizar la unicidad de códigos.
     */
    public GestorProductos() {
        this.productos = new ArrayList<>();
        this.codigosRegistrados = new HashSet<>();
    }

    /**
     * Registra un nuevo producto si su código no ha sido registrado antes.
     *
     * @param producto Producto a registrar.
     * @return true si se registró correctamente, false si el código ya existía.
     */
    public boolean registrar(Producto producto) {
        if (codigosRegistrados.contains(producto.getCodigo())) {
            return false;
        }
        productos.add(producto);
        codigosRegistrados.add(producto.getCodigo());
        return true;
    }

    /**
     * Devuelve la lista de productos registrados.
     *
     * @return Lista de productos.
     */
    public List<Producto> listar() {
        return new ArrayList<>(productos);
    }

    /**
     * Busca un producto por su código único.
     *
     * @param codigo Código del producto a buscar.
     * @return El producto encontrado o null si no existe.
     */
    public Producto buscarPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equalsIgnoreCase(codigo)) {
                return producto;
            }
        }
        return null;
    }

    /**
     * Busca productos cuyo nombre contenga el texto indicado.
     * La búsqueda ignora mayúsculas/minúsculas y tildes.
     *
     * @param nombre Texto a buscar dentro del nombre.
     * @return Lista de productos que coinciden con la búsqueda.
     */
    public List<Producto> buscarPorNombre(String nombre) {
        List<Producto> coincidencias = new ArrayList<>();
        String criterio = normalizarTexto(nombre);
        for (Producto producto : productos) {
            if (normalizarTexto(producto.getNombre()).contains(criterio)) {
                coincidencias.add(producto);
            }
        }
        return coincidencias;
    }

    /**
     * Normaliza un texto eliminando tildes y convirtiéndolo a minúsculas.
     *
     * @param texto Texto a normalizar.
     * @return Texto normalizado.
     */
    private String normalizarTexto(String texto) {
        String sinTildes = Normalizer.normalize(texto, Normalizer.Form.NFD);
        sinTildes = sinTildes.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        return sinTildes.toLowerCase();
    }

    /**
     * Ordena los productos por precio de menor a mayor.
     *
     * @return Nueva lista con los productos ordenados por precio.
     */
    public List<Producto> ordenarPorPrecio() {
        List<Producto> ordenados = new ArrayList<>(productos);
        Collections.sort(ordenados, Comparator.comparingDouble(Producto::getPrecio));
        return ordenados;
    }

    /**
     * Devuelve la cantidad de productos registrados.
     *
     * @return Número de productos.
     */
    public int cantidadProductos() {
        return productos.size();
    }
}
