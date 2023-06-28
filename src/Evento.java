import java.util.ArrayList;
import java.util.List;

public class Evento {
    public String nombre;
    public String fecha;
    public String lugar;
    public double precio;
    public List<Integer> entradas;

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
