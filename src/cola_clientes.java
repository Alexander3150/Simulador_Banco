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
        System.out.println("Ingrese el nombre del cliente: ");
        nombre_cliente = scanner.nextLine();
        // Verificar si el cliente es prioridad o no (s/n)
        System.out.println("El cliente es prioridad (s/n): ");
        prioridad = scanner.nextLine().toLowerCase();

            if(prioridad.equals("s"))
            {
                colaPrioritaria.add(nombre_cliente);
                System.out.println("El cliente "+ nombre_cliente+ " se agrego a la cola correctamente, como prioridad.");
            }
            else 
            {
                colaNormal.add(nombre_cliente);
                System.out.println("El cliente"+nombre_cliente+ " se agrego a la cola correctamente. ");
            }
            mostrarCantidadClientes();
    }
    public static void mostrarCantidadClientes() 
    {
        int total = colaPrioritaria.size() + colaNormal.size();
        System.out.println("Total de clientes en espera: " + total);
    }

}
