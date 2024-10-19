package co.jmurillo.appfacturas.models;

/**
 * Clase ItemFactura
 * Representa un item o línea individual en una factura.
 * Cada item contiene un producto y su cantidad.
 */
public class ItemFactura {

    // Atributos de la clase
    private Producto producto; // El producto asociado a este item
    private Integer cantidad;  // La cantidad del producto en este item

    /**
     * Constructor de ItemFactura
     * @param producto El producto a incluir en el item
     * @param cantidad La cantidad del producto
     */
    public ItemFactura(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Métodos getter y setter

    /**
     * Obtiene el producto del item
     * @return El producto asociado a este item
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Establece el producto del item
     * @param producto El nuevo producto a asociar con este item
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Obtiene la cantidad del producto en este item
     * @return La cantidad del producto
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del producto en este item
     * @param cantidad La nueva cantidad del producto
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Calcula el importe total de este item
     * @return El importe total (precio del producto * cantidad)
     */
    public float calcularImporte(){
        return this.cantidad * this.producto.getPrecio();
    }

    /**
     * Genera una representación en cadena del item
     * @return Una cadena que representa el item, incluyendo detalles del producto,
     *         cantidad y el importe total
     */
    @Override
    public String toString() {
        return producto.toString() +
                "\t" + cantidad +
                "\t" + calcularImporte();
    }
}
