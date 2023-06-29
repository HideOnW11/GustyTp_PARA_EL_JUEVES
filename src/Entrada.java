public class Entrada {
    public int numero;                   // Número de la entrada
    public String ubicacion;             // Ubicación de la entrada
    public double precio;                // Precio de la entrada
    public boolean ocupada;              // Indicador de si la entrada está ocupada o no
    public String nombreComprador;       // Nombre del comprador de la entrada
    public String correoComprador;       // Correo electrónico del comprador de la entrada
    public int telefonoComprador;     // Número de teléfono del comprador de la entrada

    public Entrada(int numero, String ubicacion, double precio) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.ocupada = false;           // Inicialmente la entrada no está ocupada
        this.nombreComprador = "";      // Inicialmente no se ha asignado un nombre de comprador
        this.correoComprador = "";      // Inicialmente no se ha asignado un correo electrónico de comprador
        this.telefonoComprador = numero;    // Inicialmente no se ha asignado un número de teléfono de comprador
    }

    public int getNumero() {
        return numero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public String getCorreoComprador() {
        return correoComprador;
    }

    public void setCorreoComprador(String correoComprador) {
        this.correoComprador = correoComprador;
    }

    public int getTelefonoComprador() {
        return telefonoComprador;
    }

    public void setTelefonoComprador(int numeroTelefono) {
        this.telefonoComprador = numeroTelefono;
    }
}
