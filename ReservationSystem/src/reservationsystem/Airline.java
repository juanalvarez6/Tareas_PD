package reservationsystem;
import java.util.ArrayList;

public class Airline {
    private String name;
    private String identificationCode;
    private String phone;
    private String serviceClass;
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

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public String getName() {
        return name;
        
        
        
    }
    
            
}
