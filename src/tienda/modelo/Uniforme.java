package tienda.modelo;

/**
 * Clase derivada que representa un uniforme de la tienda académica.
 * Extiende de Producto e implementa Descuentable.
 */
public class Uniforme extends Producto implements Descuentable {

    private String talla;
    private String color;

    /**
     * Constructor de la clase Uniforme.
     *
     * @param codigo    Código único del uniforme.
     * @param nombre    Nombre o descripción del uniforme.
     * @param precio    Precio base del uniforme.
     * @param stock     Cantidad disponible.
     * @param categoria Categoría del uniforme.
     * @param talla     Talla del uniforme.
     * @param color     Color del uniforme.
     */
    public Uniforme(String codigo, String nombre, double precio, int stock, String categoria,
                    String talla, String color) {
        super(codigo, nombre, precio, stock, categoria);
        this.talla = talla;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Aplica un descuento al precio base del uniforme.
     *
     * @param porcentaje Porcentaje de descuento.
     * @return Precio con descuento aplicado.
     */
    @Override
    public double aplicarDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100.0);
    }

    /**
     * Calcula el precio final del uniforme aplicando un descuento fijo del 15%.
     *
     * @return Precio final con descuento.
     */
    @Override
    public double calcularPrecioFinal() {
        return aplicarDescuento(15.0);
    }

    /**
     * Sobrescritura de toString para mostrar información específica del uniforme.
     *
     * @return Información detallada del uniforme.
     */
    @Override
    public String toString() {
        return "[UNIFORME] " + super.toString()
                + " | Talla: " + talla
                + " | Color: " + color
                + " | Precio final (15% dto): S/ " + String.format("%.2f", calcularPrecioFinal());
    }
}
