import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VentaEntradas {
    private List<Entrada> entradasDisponibles;

    public VentaEntradas() {
        entradasDisponibles = new ArrayList<>();
    }

    public void agregarEntrada(Entrada entrada) {
        entradasDisponibles.add(entrada);
    }

    public void mostrarEntradasDisponibles() {
        for (Entrada entrada : entradasDisponibles) {
            System.out.println(entrada);
        }
    }

    public boolean venderEntrada(Entrada entrada) {
        if (entradasDisponibles.contains(entrada)) {
            entradasDisponibles.remove(entrada);
            return true;
        }
        return false;
    }

    public int obtenerCantidadEntradasDisponibles() {
        return entradasDisponibles.size();
    }

    public static class Entrada {
        private String codigo;
        private String evento;
        private double precio;

        public Entrada(String codigo, String evento, double precio) {
            this.codigo = codigo;
            this.evento = evento;
            this.precio = precio;
        }

        public String getCodigo() {
            return codigo;
        }

        public String getEvento() {
            return evento;
        }

        public double getPrecio() {
            return precio;
        }

        @Override
        public String toString() {
            return "Entrada [Código: " + codigo + ", Evento: " + evento + ", Precio: " + precio + "]";
        }
    }

    public static void main(String[] args) {
        VentaEntradas ventaEntradas = new VentaEntradas();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("----- Menú de Venta de Entradas -----");
            System.out.println("1. Mostrar entradas disponibles");
            System.out.println("2. Vender entrada");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("----- Entradas Disponibles -----");
                    ventaEntradas.mostrarEntradasDisponibles();
                    System.out.println("----------------------------------");
                    break;
                case 2:
                    System.out.println("----- Vender Entrada -----");
                    System.out.print("Ingrese el código de la entrada: ");
                    String codigo = scanner.next();
                    // Validar si la entrada está disponible y realizar la venta
                    Entrada entrada = null;
                    for (Entrada e : ventaEntradas.entradasDisponibles) {
                        if (e.getCodigo().equals(codigo)) {
                            entrada = e;
                            break;
                        }
                    }
                    if (entrada != null && ventaEntradas.venderEntrada(entrada)) {
                        System.out.println("Venta realizada con éxito.");
                    } else {
                        System.out.println("La entrada no está disponible o no existe.");
                    }
                    break;
                case 3:
                    System.out.println("Gracias por utilizar el sistema de venta de entradas.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

            System.out.println();
        } while (opcion != 3);

        scanner.close();
    }
}
