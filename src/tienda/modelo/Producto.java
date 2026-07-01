package tienda.modelo;

/**
 * Clase abstracta base que representa un producto genérico de la tienda académica.
 * Contiene los atributos comunes a todos los productos.
 */
public abstract class Producto {

    protected String codigo;
    protected String nombre;
    protected double precio;
    protected int stock;
    protected String categoria;

    /**
     * Constructor de la clase abstracta Producto.
     *
     * @param codigo    Código único del producto.
     * @param nombre    Nombre del producto.
     * @param precio    Precio base del producto.
     * @param stock     Cantidad disponible en stock.
     * @param categoria Categoría a la que pertenece el producto.
     */
    public Producto(String codigo, String nombre, double precio, int stock, String categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Método abstracto que calcula el precio final del producto.
     * Cada subclase lo implementará según sus reglas específicas.
     *
     * @return Precio final del producto.
     */
    public abstract double calcularPrecioFinal();

    /**
     * Representación general del producto. Las subclases pueden sobrescribirlo.
     *
     * @return Cadena con la información del producto.
     */
    @Override
    public String toString() {
        return "Código: " + codigo
                + " | Nombre: " + nombre
                + " | Precio base: S/ " + String.format("%.2f", precio)
                + " | Stock: " + stock
                + " | Categoría: " + categoria;
    }
}
