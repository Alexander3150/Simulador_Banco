import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cola_clientes {

    static Queue<String> colaNormal = new LinkedList<>();
    static Queue<String> colaPrioritaria = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);
    static String nombre_cliente;
    static String prioridad; 
    

    public static void  agregarCliente()
    {
        //Ingresar el nombre del cliente 
        System.out.println("========================================");
        System.out.println(" Ingrese el nombre del cliente: ");
        nombre_cliente = scanner.nextLine();
        // Verificar si el cliente es prioridad o no (s/n)
        System.out.println("========================================");
        System.out.println(" El cliente es prioridad (s/n): ");
        prioridad = scanner.nextLine().toLowerCase();

            if(prioridad.equals("s"))
            {
                colaPrioritaria.add(nombre_cliente);
                System.out.println("================================================================================");
                System.out.println("El cliente "+ nombre_cliente+ " se agrego a la cola correctamente, como prioridad.");
                System.out.println("================================================================================");
            }
            else 
            {
                colaNormal.add(nombre_cliente);
                System.out.println("===============================================================");
                System.out.println("El cliente"+nombre_cliente+ " se agrego a la cola correctamente. ");
                System.out.println("===============================================================");
            }
            mostrarCantidadClientes();
    }
    public static void mostrarCantidadClientes() 
    {
        int total = colaPrioritaria.size() + colaNormal.size();
        System.out.println("====================================");
        System.out.println("Total de clientes en espera: " + total);
        System.out.println("====================================");
    }
    public static void atenderCliente() {
        if (!colaPrioritaria.isEmpty()) {
            System.out.println("==========================================================");
            System.out.println("Atendiendo a cliente prioritario: " + colaPrioritaria.poll());
            System.out.println("==========================================================");
        } else if (!colaNormal.isEmpty()) {
            System.out.println("========================================");
            System.out.println("Atendiendo a cliente: " + colaNormal.poll());
            System.out.println("========================================");
        } else {
            System.out.println("================================");
            System.out.println("No hay clientes en espera.");
            System.out.println("================================");
        }
        mostrarCantidadClientes();
    }

    public static void mostrarCola() {
        if (colaPrioritaria.isEmpty() && colaNormal.isEmpty()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("============================================");
            System.out.println("\nClientes prioritarios en espera: " + colaPrioritaria);
            System.out.println("Clientes normales en espera: " + colaNormal);
            System.out.println("============================================");
            mostrarCantidadClientes();
        }
    }


}
