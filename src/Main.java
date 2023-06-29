import java.util.Scanner;

public class Main {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        // Crear un nuevo evento
        Evento evento = new Evento("2023-07-01", "20:00", "Estadio X");
        // Agregar entradas al evento
        evento.agregarEntrada(new Entrada(1, "Planta Alta - Asiento 1", 50.0));
        evento.agregarEntrada(new Entrada(2, "Planta Alta - Asiento 2", 50.0));
        evento.agregarEntrada(new Entrada(3, "Planta Baja - Asiento 1", 100.0));
        evento.agregarEntrada(new Entrada(4, "Planta Baja - Asiento 2", 100.0));
        
        // Crear el menú y mostrarlo
        Menu menu = new Menu(evento);
        ConsoleUtils.clearConsole();
        System.out.println("Bienvenido al evento realizado en "+evento.lugar+" el "+evento.fecha+" a las "+evento.hora+"hs.");
        System.out.println("Precione enter para ingresar");
        scanner.nextLine(); 
        menu.mostrarMenu();
    }
}
