import java.util.ArrayList;
import java.util.List;

public class EmpresaDeEntretenimiento {
    public String nombre;
    public List<Evento> eventos;

    public EmpresaDeEntretenimiento(String nombre) {
        this.nombre = nombre;
        eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void mostrarDetallesEvento(Evento evento) {
        System.out.println("Detalles del evento:");
        System.out.println("Nombre: " + evento.getNombre());
        System.out.println("Fecha: " + evento.getFecha());
        System.out.println("Lugar: " + evento.getLugar());
        System.out.println("Precio de las entradas: " + evento.getPrecio());
    }

    public void venderEntrada(Evento evento, int numeroEntradas, Cliente cliente) {
        List<Integer> entradasDisponibles = evento.getEntradasDisponibles();
        if (entradasDisponibles.size() >= numeroEntradas) {
            List<Integer> entradasVendidas = entradasDisponibles.subList(0, numeroEntradas);
            evento.venderEntradas(entradasVendidas);
            Comprobante comprobante = new Comprobante(evento, entradasVendidas, cliente);
            enviarComprobante(comprobante, cliente);
            System.out.println("Venta exitosa. Se han vendido " + numeroEntradas + " entradas.");
        } else {
            System.out.println("No hay suficientes entradas disponibles para la venta.");
        }
    }

    public List<Integer> obtenerEntradasDisponibles(Evento evento) {
        return evento.getEntradasDisponibles();
    }

    public void generarInformesYEstadisticas() {
        // Implementar lógica para generar informes y estadísticas
        System.out.println("Generando informes y estadísticas...");
    }

    public void enviarComprobante(Comprobante comprobante, Cliente cliente) {
        // Lógica para enviar el comprobante por correo electrónico o mensaje al cliente
        System.out.println("Enviando comprobante de compra a " + cliente.getEmail());
    }
}
