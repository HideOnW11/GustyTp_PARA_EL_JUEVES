public class Main {
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
        menu.mostrarMenu();
    }
}
