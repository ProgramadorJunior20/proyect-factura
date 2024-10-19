package co.jmurillo.appfacturas;

// Importamos las clases necesarias del paquete de modelos y la clase Scanner para entrada de usuario
import co.jmurillo.appfacturas.models.*;
import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        // Creamos un nuevo cliente y establecemos sus datos
        Cliente cliente = new Cliente();
        cliente.setNif("2222-5");
        cliente.setNombre("AJuz");

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese una descripción de la factura: ");

        // Creamos una nueva factura con la descripción ingresada y el cliente
        Factura factura = new Factura(s.nextLine(), cliente);

        // Declaramos una variable para almacenar los productos
        Producto producto;

        System.out.println();

        // Ciclo para ingresar 2 productos
        for(int i = 0; i < 2; i++){
            producto = new Producto();
            System.out.print("Ingrese producto n° " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese cantidad: ");

            // Creamos un nuevo ItemFactura con el producto y la cantidad, y lo añadimos a la factura
            factura.addItemFactura(new ItemFactura(producto, s.nextInt()));

            System.out.println();
            s.nextLine(); // Consumimos el salto de línea pendiente
        }

        // Imprimimos la factura completa
        System.out.println(factura);
    }
}
