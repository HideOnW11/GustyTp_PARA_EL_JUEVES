import java.util.List;
import java.util.Scanner;
public class EntradaOnlineSystem {
    public Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        EmpresaDeEntretenimiento empresa = new EmpresaDeEntretenimiento("Mi Empresa de Entretenimiento");
        Evento evento = new Evento("Concierto", "2023-07-01", "Estadio XYZ", 50.0, 100);
        empresa.agregarEvento(evento);

        empresa.mostrarDetallesEvento(evento);
        System.out.println("Ingresa tu nombre");
        String nombre = lector.nextLine();
        System.out.println("Ingresar un mail");
        String mail = lector.nextLine();
        Cliente cliente1 = new Cliente(nombre, mail);
        empresa.venderEntrada(evento, 2, cliente1);
        empresa.venderEntrada(evento, 3, cliente1);

        List<Integer> entradasDisponibles = empresa.obtenerEntradasDisponibles(evento);
        System.out.println("Entradas disponibles para el evento:");
        for (Integer entrada : entradasDisponibles) {
            System.out.println("Entrada #" + entrada);
        }

        empresa.generarInformesYEstadisticas();
    }
}
