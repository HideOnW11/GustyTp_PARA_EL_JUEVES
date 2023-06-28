import java.util.List;

public class Comprobante {
    public Evento evento;
    public List<Integer> entradas;
    public Cliente cliente;

    public Comprobante(Evento evento, List<Integer> entradas, Cliente cliente) {
        this.evento = evento;
        this.entradas = entradas;
        this.cliente = cliente;
    }
}
