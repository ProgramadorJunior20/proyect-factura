package co.jmurillo.appfacturas.models;

/**
 * Clase Producto
 * Representa un producto en el sistema de facturación.
 * Cada producto tiene un código único, un nombre y un precio.
 */
public class Producto {

    // Atributos de la clase
    private Integer codigo;       // Código único del producto
    private String nombre;        // Nombre del producto
    private float precio;         // Precio del producto
    private static int ultimoCodigo; // Contador estático para generar códigos únicos

    /**
     * Constructor de Producto
     * Crea un nuevo producto con un código único autogenerado.
     */
    public Producto() {
        this.codigo = ++ultimoCodigo; // Incrementa y asigna un nuevo código
    }

    /**
     * Obtiene el código del producto
     * @return El código único del producto
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * Obtiene el nombre del producto
     * @return El nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto
     * @param nombre El nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del producto
     * @return El precio del producto
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto
     * @param precio El nuevo precio del producto
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Genera una representación en cadena del producto
     * @return Una cadena que representa el producto, incluyendo su código, nombre y precio
     */
    @Override
    public String toString() {
        return  codigo +
                "\t" + nombre +
                "\t" + precio;
    }
}
