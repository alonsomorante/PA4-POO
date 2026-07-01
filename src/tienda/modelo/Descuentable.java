package tienda.modelo;

/**
 * Interfaz que define el comportamiento obligatorio de aplicar descuentos
 * a los productos de la tienda académica.
 */
public interface Descuentable {

    /**
     * Aplica un descuento al precio base del producto.
     *
     * @param porcentaje Porcentaje de descuento a aplicar (por ejemplo, 10.0 para 10%).
     * @return El precio con el descuento aplicado.
     */
    double aplicarDescuento(double porcentaje);
}
