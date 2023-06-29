import java.util.Scanner;

public class Main {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        // Crear un nuevo evento
        Evento evento = new Evento("01/07/2023", "20:00", "Estadio: Monumental", "Argentina-Ecuador");
        // Agregar entradas al evento
        evento.agregarEntrada(new Entrada(1, "Platea Alta - Asiento 1", 50.0));
        evento.agregarEntrada(new Entrada(2, "Platea Alta - Asiento 2", 50.0));
        evento.agregarEntrada(new Entrada(3, "Platea Alta - Asiento 3", 50.0));
        evento.agregarEntrada(new Entrada(4, "Platea Alta - Asiento 4", 50.0));
        evento.agregarEntrada(new Entrada(5, "Platea Alta - Asiento 5", 50.0));
        evento.agregarEntrada(new Entrada(6, "Platea Alta - Asiento 6", 50.0));
        evento.agregarEntrada(new Entrada(7, "Platea Baja - Asiento 1", 100.0));
        evento.agregarEntrada(new Entrada(8, "Platea Baja - Asiento 2", 100.0));
        evento.agregarEntrada(new Entrada(9, "Platea Baja - Asiento 3", 100.0));
        evento.agregarEntrada(new Entrada(10, "Platea Baja - Asiento 4", 100.0));
        evento.agregarEntrada(new Entrada(11, "Platea Baja - Asiento 5", 100.0));
        evento.agregarEntrada(new Entrada(12, "Platea Baja - Asiento 6", 100.0)); 
    
        
        // Crear el menú y mostrarlo
        Menu menu = new Menu(evento);
        ConsoleUtils.clearConsole();
        System.out.println("Bienvenido a Truchantikeck\n\u001a Partido: "+evento.tdp+" (Amistoso)\n\u001a " +evento.lugar+"\n\u001a   Fecha: "+evento.fecha+"\n\u001a Horario: "+evento.hora+"hs.");
        System.out.println("Presione enter para ingresar");
        scanner.nextLine(); 
        menu.mostrarMenu();
    }
}
