package co.jmurillo.appfacturas.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    // Atributos de la clase Factura
    private Integer folio;                  // Número único de la factura
    private String descripcion;             // Descripción general de la factura
    private Date fecha;                     // Fecha de emisión de la factura
    private Cliente cliente;                // Cliente asociado a la factura
    private ItemFactura[] items;            // Array para almacenar los items de la factura
    private int indiceItems;                // Índice para controlar la cantidad de items agregados
    public static final int MAX_ITEMS = 12; // Número máximo de items permitidos
    private static int ultimoFolio;         // Contador estático para generar folios únicos

    // Constructor de la clase
    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;         // Incrementa y asigna un nuevo folio
        this.fecha = new Date();            // Establece la fecha actual
    }

    // Métodos getter y setter

    public Integer getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    // Método para agregar un item a la factura
    public void addItemFactura(ItemFactura item){
        // Agrega el item solo si no se ha alcanzado el máximo
        if(indiceItems < MAX_ITEMS){
            this.items[indiceItems++] = item;
        }
    }

    // Método para calcular el total de la factura
    public float calcularTotal(){
        float total = 0.0f;
        for(int i = 0; i < indiceItems; i++){
            total += this.items[i].calcularImporte();
        }
        return total;
    }

    // Método para generar una representación detallada de la factura
    public String verDetalle(){
        StringBuilder sb = new StringBuilder("Factura N°: ");
        sb.append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t NIF: ")
                .append(this.cliente.getNif())
                .append("\nDescripción: ")
                .append(this.descripcion)
                .append("\n");

        // Formatea la fecha en un formato más legible
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emisión: ")
                .append(df.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t\t$\tCant.\tTotal\n");

        // Agrega cada item de la factura al detalle
        for(int i = 0; i < indiceItems; i++){
            sb.append(this.items[i].toString())
                    .append("\n");
        }
        sb.append("\n Gran Total: ")
                .append(calcularTotal());
        return sb.toString();
    }

    // Sobreescribe el método toString para mostrar el detalle de la factura
    @Override
    public String toString() {
        return verDetalle();
    }
}

