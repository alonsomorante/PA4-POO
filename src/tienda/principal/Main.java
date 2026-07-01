package tienda.principal;

import tienda.modelo.Libro;
import tienda.modelo.Producto;
import tienda.modelo.Uniforme;
import tienda.servicio.GestorProductos;

import java.util.List;
import java.util.Scanner;

/**
 * Clase principal que ejecuta el menú interactivo de la tienda académica.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GestorProductos gestor = new GestorProductos();

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");
            switch (opcion) {
                case 1:
                    registrarProducto();
                    break;
                case 2:
                    listarProductos();
                    break;
                case 3:
                    buscarPorCodigo();
                    break;
                case 4:
                    buscarPorNombre();
                    break;
                case 5:
                    ordenarPorPrecio();
                    break;
                case 6:
                    System.out.println("Gracias por usar la Tienda Académica.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            System.out.println();
        } while (opcion != 6);
    }

    private static void mostrarMenu() {
        System.out.println("=== TIENDA ACADÉMICA ===");
        System.out.println("1. Registrar producto");
        System.out.println("2. Listar productos");
        System.out.println("3. Buscar producto por código");
        System.out.println("4. Buscar producto por nombre");
        System.out.println("5. Ordenar productos por precio");
        System.out.println("6. Salir");
    }

    private static void registrarProducto() {
        System.out.println("\n--- Registro de producto ---");
        System.out.println("Tipo de producto:");
        System.out.println("1. Libro");
        System.out.println("2. Uniforme");
        int tipo = leerEntero("Seleccione tipo: ");

        String codigo = leerTexto("Código: ");
        String nombre = leerTexto("Nombre: ");
        double precio = leerDouble("Precio base: ");
        int stock = leerEntero("Stock: ");
        String categoria = leerTexto("Categoría: ");

        Producto producto = null;

        if (tipo == 1) {
            String autor = leerTexto("Autor: ");
            String editorial = leerTexto("Editorial: ");
            producto = new Libro(codigo, nombre, precio, stock, categoria, autor, editorial);
        } else if (tipo == 2) {
            String talla = leerTexto("Talla: ");
            String color = leerTexto("Color: ");
            producto = new Uniforme(codigo, nombre, precio, stock, categoria, talla, color);
        } else {
            System.out.println("Tipo de producto no válido.");
            return;
        }

        boolean registrado = gestor.registrar(producto);
        if (registrado) {
            System.out.println("Producto registrado exitosamente.");
        } else {
            System.out.println("Error: ya existe un producto con el código \"" + codigo + "\".");
        }
    }

    private static void listarProductos() {
        System.out.println("\n--- Lista de productos ---");
        List<Producto> lista = gestor.listar();
        if (lista.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto producto : lista) {
                System.out.println(producto);
            }
            System.out.println("Total de productos: " + gestor.cantidadProductos());
        }
    }

    private static void buscarPorCodigo() {
        System.out.println("\n--- Búsqueda por código ---");
        String codigo = leerTexto("Ingrese el código: ");
        Producto encontrado = gestor.buscarPorCodigo(codigo);
        if (encontrado != null) {
            System.out.println("Producto encontrado:");
            System.out.println(encontrado);
        } else {
            System.out.println("No se encontró ningún producto con el código \"" + codigo + "\".");
        }
    }

    private static void buscarPorNombre() {
        System.out.println("\n--- Búsqueda por nombre ---");
        String nombre = leerTexto("Ingrese el nombre o parte del nombre: ");
        List<Producto> coincidencias = gestor.buscarPorNombre(nombre);
        if (coincidencias.isEmpty()) {
            System.out.println("No se encontraron coincidencias.");
        } else {
            System.out.println("Coincidencias encontradas:");
            for (Producto producto : coincidencias) {
                System.out.println(producto);
            }
        }
    }

    private static void ordenarPorPrecio() {
        System.out.println("\n--- Productos ordenados por precio (menor a mayor) ---");
        List<Producto> ordenados = gestor.ordenarPorPrecio();
        if (ordenados.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto producto : ordenados) {
                System.out.println("S/ " + String.format("%.2f", producto.getPrecio()) + " -> " + producto.getNombre());
            }
        }
    }

    private static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine().trim();
    }

    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número entero válido.");
            scanner.next();
            System.out.print(mensaje);
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); // Limpiar el salto de línea
        return valor;
    }

    private static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número decimal válido.");
            scanner.next();
            System.out.print(mensaje);
        }
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el salto de línea
        return valor;
    }
}
