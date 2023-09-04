package reservationsystem;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Airline {
    private String name;
    private String identificationCode;
    private String phone;
    private ArrayList<Plane> aircraftFleet = new ArrayList<>();
    private ArrayList<Flight> flightList = new ArrayList<>();
    
    public Airline(String name, String identificationCode, String phone){
        this.name = name;
        this.identificationCode = identificationCode;
        this.phone = phone;
    }
    
    public Flight createFlight(String flightCode, String origin, String destination, String classFlight, int year, int month, int day, String hora, Plane plane){
        if(!aircraftFleet.isEmpty()){
            return new Flight(flightCode, origin, destination, classFlight, year, month, day, hora, plane);
        }else{
            try{     
            }catch(Exception e){
                System.out.println("!No hay aviones disponibles");
            }
        }
        return null;
    }
    
    public void addPlane(){
        int opcion = 0, capacity;
        String serialNumber, planeModel;
        try{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresar cuantos aviones desea agregar a la aerolinea"));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null ,"Debes ingresar un numero entero valido");
        }
        for(int i=1; i <= opcion; i++){
            serialNumber = JOptionPane.showInputDialog("Ingresar numero de serie del avion");
            planeModel = JOptionPane.showInputDialog("Ingresar modelo del avion");
            capacity = Integer.parseInt(JOptionPane.showInputDialog("Ingresar capacidad del avion"));
            aircraftFleet.add(new Plane(serialNumber, planeModel, capacity));
        }
        JOptionPane.showMessageDialog(null ,"Aviones ingresados");
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Plane> getAircraftFleet() {
        return aircraftFleet;
    }

    @Override
    public String toString() {
        return "\nNombre: " + name 
                + "\nCódigo de identificación: " + identificationCode 
                + "\nTelefono: " + phone;
    } 
}
