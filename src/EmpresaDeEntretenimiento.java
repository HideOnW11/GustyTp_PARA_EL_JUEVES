import java.util.ArrayList;
import java.util.List;

public class EmpresaDeEntretenimiento {
    private List<Evento> eventos;

    public EmpresaDeEntretenimiento() {
        eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void mostrarDetallesEvento(Evento evento) {
        System.out.println("Fecha: " + evento.getFecha());
        System.out.println("Hora: " + evento.getHora());
        System.out.println("Lugar: " + evento.getLugar());
        System.out.println("Precio: " + evento.getPrecio());
    }

    public void generarInformesYEstadisticas() {
        // Implementar lógica para generar informes y estadísticas
    }

    public List<Evento> getEventos() {
        return eventos;
    }
}
