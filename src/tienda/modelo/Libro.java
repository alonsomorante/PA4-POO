package tienda.modelo;

/**
 * Clase derivada que representa un libro de la tienda académica.
 * Extiende de Producto e implementa Descuentable.
 */
public class Libro extends Producto implements Descuentable {

    private String autor;
    private String editorial;

    /**
     * Constructor de la clase Libro.
     *
     * @param codigo    Código único del libro.
     * @param nombre    Título del libro.
     * @param precio    Precio base del libro.
     * @param stock     Cantidad disponible.
     * @param categoria Categoría del libro.
     * @param autor     Autor del libro.
     * @param editorial Editorial del libro.
     */
    public Libro(String codigo, String nombre, double precio, int stock, String categoria,
                 String autor, String editorial) {
        super(codigo, nombre, precio, stock, categoria);
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * Aplica un descuento al precio base del libro.
     *
     * @param porcentaje Porcentaje de descuento.
     * @return Precio con descuento aplicado.
     */
    @Override
    public double aplicarDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100.0);
    }

    /**
     * Calcula el precio final del libro aplicando un descuento fijo del 10%.
     *
     * @return Precio final con descuento.
     */
    @Override
    public double calcularPrecioFinal() {
        return aplicarDescuento(10.0);
    }

    /**
     * Sobrescritura de toString para mostrar información específica del libro.
     *
     * @return Información detallada del libro.
     */
    @Override
    public String toString() {
        return "[LIBRO] " + super.toString()
                + " | Autor: " + autor
                + " | Editorial: " + editorial
                + " | Precio final (10% dto): S/ " + String.format("%.2f", calcularPrecioFinal());
    }
}
