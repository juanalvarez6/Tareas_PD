package reservationsystem;

public class Flight {
    private String flightCode;
    private String origin;
    private String destination;
    private String classFlight;
    private String fecha;
    private String hora;
    private Plane plane;

    public Flight(String flightCode, String origin, String destination, String classFlight,String fecha, String hora) {
        this.flightCode = flightCode;
        this.origin = origin;
        this.destination = destination;
        this.classFlight = classFlight;
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    @Override
    public String toString() {
        return "Informacion del vuelo: " + flightCode 
                + "\n  Origen: " + origin 
                + "\n  Destino: " + destination 
                + "\n  Clase: " + classFlight
                + "\n  Fecha y hora: " + fecha + " "+ hora;
    }
}