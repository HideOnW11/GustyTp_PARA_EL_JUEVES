import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmpresaDeEntretenimiento empresa = new EmpresaDeEntretenimiento();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar evento");
            System.out.println("2. Mostrar eventos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                scanner.nextLine(); // Limpiar el buffer
                System.out.print("Fecha: ");
                String fecha = scanner.nextLine();
                System.out.print("Hora: ");
                String hora = scanner.nextLine();
                System.out.print("Lugar: ");
                String lugar = scanner.nextLine();
                System.out.print("Precio: ");
                double precio = scanner.nextDouble();

                Evento evento = new Evento(fecha, hora, lugar, precio);
                empresa.agregarEvento(evento);
                System.out.println("Evento agregado con éxito.");
            } else if (opcion == 2) {
                List<Evento> eventos = empresa.getEventos();
                for (int i = 0; i < eventos.size(); i++) {
                    System.out.println("Evento #" + (i + 1));
                    empresa.mostrarDetallesEvento(eventos.get(i));
                    System.out.println();
                }
            } else if (opcion == 3) {
                break;
            }
        }

        scanner.close();
    }
}
