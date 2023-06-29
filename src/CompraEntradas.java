import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CompraEntradas {
    public Evento evento;
    public Scanner scanner;
    public ConsoleUtils clear;

    public CompraEntradas(Evento evento) {
        this.evento = evento;
        this.scanner = new Scanner(System.in);
    }

    public void realizarCompra() {
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su correo electrónico: ");
        String correoElectronico = scanner.nextLine();

        int numeroTelefono = 0;
        boolean entradaValida = false;
        do {
            try {
                System.out.print("Ingrese su número de teléfono móvil:");
                numeroTelefono = scanner.nextInt();
                scanner.nextLine(); // Limpiar el salto de línea

                String telefonoString = String.valueOf(numeroTelefono);
                if (telefonoString.length() == 10) {
                    entradaValida = true;
                } else {
                    System.out.println("El número de teléfono debe tener exactamente 10 dígitos. Por favor, inténtelo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("El número de teléfono debe ser un valor numérico. Por favor, inténtelo de nuevo.");
                scanner.nextLine(); // Limpiar el buffer
            }
        } while (!entradaValida);

        List<Entrada> entradasDisponibles = evento.getEntradasDisponibles();
        if (entradasDisponibles.isEmpty()) {
            System.out.println("Lo sentimos, no hay entradas disponibles.");
        } else {
            System.out.println("Entradas disponibles:");
            for (Entrada entrada : entradasDisponibles) {
                System.out.println(entrada.getNumero() + " - " + entrada.getUbicacion());
            }

            int numeroEntrada = 0;
            entradaValida = false;
            do {
                try {
                    System.out.print("Seleccione el número de entrada que desea comprar: ");
                    numeroEntrada = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el salto de línea
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("El número de entrada debe ser un valor numérico. Por favor, inténtelo de nuevo.");
                    scanner.nextLine(); // Limpiar el buffer
                }
            } while (!entradaValida);

            Entrada entradaComprada = evento.comprarEntrada(numeroEntrada, nombre, correoElectronico, numeroTelefono);
            if (entradaComprada != null) {
                ConsoleUtils.clearConsole();
                System.out.println("¡Compra realizada con éxito!");
                System.out.println("Datos de la entrada:");
                System.out.println("Número de entrada: " + entradaComprada.getNumero());
                System.out.println("Ubicación: " + entradaComprada.getUbicacion());
                System.out.println("Precio: " + entradaComprada.getPrecio());
                System.out.println("Nombre del comprador: " + entradaComprada.getNombreComprador());
                System.out.println("Correo electrónico del comprador: " + entradaComprada.getCorreoComprador());
                System.out.println("Número de teléfono del comprador: " + entradaComprada.getTelefonoComprador());
                System.out.println("Para continuar, presione la tecla Enter...");
                scanner.nextLine();
            } else {
                System.out.println("El número de entrada seleccionado no está disponible.");
            }
        }
    }
}
