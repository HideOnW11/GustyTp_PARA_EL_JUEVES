public class Evento {
    private String fecha;
    private String hora;
    private String lugar;
    private double precio;

    public Evento(String fecha, String hora, String lugar, double precio) {
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    public double getPrecio() {
        return precio;
    }
}
