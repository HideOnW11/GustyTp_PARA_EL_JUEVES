import java.util.List;
import java.util.Scanner;

public class Menu {
    public Evento evento;
    public Scanner scanner;
    public CompraEntradas compraEntradas;
    public ConsoleUtils clear;
    
    public Menu(Evento evento) {
        this.evento = evento;
        this.scanner = new Scanner(System.in);
        this.compraEntradas = new CompraEntradas(evento);
    }

    public void mostrarMenu() {
        int opcion;

        do {
            ConsoleUtils.clearConsole();
            System.out.println("=== MENÚ ===");
            System.out.println("1. Mostrar entradas disponibles");
            System.out.println("2. Mostrar entradas ocupadas");
            System.out.println("3. Comprar entrada");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el salto de línea
            ConsoleUtils.clearConsole();
            switch (opcion) {
                case 1:
                    List<Entrada> disponibles = evento.getEntradasDisponibles();
                    System.out.println("Entradas disponibles:");
                    for (Entrada entrada : disponibles) {
                        System.out.println(entrada.getNumero() + " - " + entrada.getUbicacion());
                    }
                    break;
                case 2:
                    List<Entrada> ocupadas = evento.getEntradasOcupadas();
                    System.out.println("Entradas ocupadas:");
                    for (Entrada entrada : ocupadas) {
                        System.out.println(entrada.getNumero() + " - " + entrada.getUbicacion());
                    }
                    break;
                case 3:
                    compraEntradas.realizarCompra();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

            System.out.println();
        } while (opcion != 4);
    }

}
