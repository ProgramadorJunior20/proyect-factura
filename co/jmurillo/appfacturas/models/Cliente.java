package co.jmurillo.appfacturas.models;

/**
 * Clase Cliente
 * Esta clase representa a un cliente en el sistema.
 */
public class Cliente {

    // Atributos de la clase
    private String nombre;  // Almacena el nombre del cliente
    private String nif;     // Almacena el Número de Identificación Fiscal (NIF) del cliente

    /**
     * Obtiene el nombre del cliente
     * @return String con el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente
     * @param nombre String con el nuevo nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el NIF del cliente
     * @return String con el NIF del cliente
     */
    public String getNif() {
        return nif;
    }

    /**
     * Establece el NIF del cliente
     * @param nif String con el nuevo NIF del cliente
     */
    public void setNif(String nif) {
        this.nif = nif;
    }
}
