import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nombre;
    private String fecha;
    private String lugar;
    private double precio;
    private List<Integer> entradas;

    public Evento(String nombre, String fecha, String lugar, double precio, int cantidadEntradas) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.precio = precio;
        entradas = new ArrayList<>();
        for (int i = 1; i <= cantidadEntradas; i++) {
            entradas.add(i);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public double getPrecio() {
        return precio;
    }

    public List<Integer> getEntradasDisponibles() {
        return entradas;
    }

    public void venderEntradas(List<Integer> entradasVendidas) {
        entradas.removeAll(entradasVendidas);
    }
}
