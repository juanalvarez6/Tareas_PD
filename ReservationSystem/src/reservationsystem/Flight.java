package reservationsystem;

public class Flight {
    private String flightCode;
    private String origin;
    private String destination;
    private String classFlight;
    private int year;
    private int month;
    private int day;
    private String hora;
    private Plane plane;

    public Flight(String flightCode, String origin, String destination, String classFlight, int year, int month, int day, String hora, Plane plane) {
        this.flightCode = flightCode;
        this.origin = origin;
        this.destination = destination;
        this.classFlight = classFlight;
        this.year = year;
        this.month = month;
        this.day = day;
        this.hora = hora;
        this.plane = plane;
    }

    @Override
    public String toString() {
        return "Informacion del vuelo: " + flightCode 
                + "\n  Origen: " + origin 
                + "\n  Destino: " + destination 
                + "\n  Clase: " + classFlight
                + "\n  Fecha y hora: " + year + "/" + month + "/" + day + " " + hora;
    }
}