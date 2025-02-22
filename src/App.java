import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    int opcion;
        do {
            opcion = mostrarMenu(); 
            switch (opcion) {
                case 1:
                    System.out.println("Agregando cliente...");
                    cola_clientes.agregarCliente();
                    break;
                case 2:
                    System.out.println("Atendiendo cliente...");
                    cola_clientes.atenderCliente();
                    break;
                case 3:
                    System.out.println("Mostrando cola de espera...");
                    cola_clientes.mostrarCola();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }

    
    public static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Bienvanido -----");
        System.out.println("\n--- Sistema de Atención en Banco ---");
        System.out.println("1. Agregar cliente");
        System.out.println("2. Atender cliente");
        System.out.println("3. Mostrar cola de espera");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        int opc = scanner.nextInt();
        return opc; 
    }

    }

