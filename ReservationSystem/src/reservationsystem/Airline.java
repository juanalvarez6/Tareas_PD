package reservationsystem;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Airline {
    private String name;
    private String identificationCode;
    private String phone;
    private ArrayList<Plane> aircraftFleet = new ArrayList<>();
    private ArrayList<Flight> flightList = new ArrayList<>();
    private ArrayList<People> peopleList = new ArrayList<>();
    
    public Airline(String name, String identificationCode, String phone){
        this.name = name;
        this.identificationCode = identificationCode;
        this.phone = phone;
    }
    
    public void addFlight(){
        if(!aircraftFleet.isEmpty()){
            String flightCode, origin, destination, classFlight, fecha, hora;
            flightCode = JOptionPane.showInputDialog("Ingresar código del vuelo");
            origin = JOptionPane.showInputDialog("Ingresar origen del vuelo");
            destination = JOptionPane.showInputDialog("Ingresar destino del vuelo");
            classFlight = JOptionPane.showInputDialog("Ingresar clase del vuelo");
            fecha = JOptionPane.showInputDialog("Ingresar fecha del vuelo en formato \"dd/mm/aa\"");
            hora = JOptionPane.showInputDialog("Ingresar hora del vuelo en formato de 24 horas \"HH:MM\"");
            flightList.add(new Flight(flightCode, origin,destination, classFlight, fecha, hora));
            int ultimoElemeto = flightList.size() - 1;
            int i = 1, opcion;
            String planes = "";
            Iterator<Plane> itPlane = aircraftFleet.iterator();
            while(itPlane.hasNext()) {
                planes += "Avión #" + i + ": " + itPlane.next().toString()+ "\n\n";
                i++;
            }
            opcion = Integer.parseInt(JOptionPane.showInputDialog(planes + "Ingresar número de avion para asignarlo al vuelo: "));
            flightList.get(ultimoElemeto).setPlane(aircraftFleet.get(opcion - 1));
        }else{
            JOptionPane.showMessageDialog(null, "No hay aviones disponibles para asignarlo a un vuelo");
        }
    }
    
    public void addPlane(){
        int opcion = 0, capacity;
        String serialNumber, planeModel;
        try{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresar cuantos aviones desea agregar a la aerolinea"));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null ,"Debes ingresar un numero entero valido");
        }
        for(int i = 1; i <= opcion; i++){
            serialNumber = JOptionPane.showInputDialog("Ingresar numero de serie del avion #" + i);
            planeModel = JOptionPane.showInputDialog("Ingresar modelo del avion");
            capacity = Integer.parseInt(JOptionPane.showInputDialog("Ingresar capacidad del avion"));
            aircraftFleet.add(new Plane(serialNumber, planeModel, capacity));
        }
        JOptionPane.showMessageDialog(null ,"Aviones ingresados");
    }
    
    public void reserveFlight(){
        if(!flightList.isEmpty()){
            Iterator<Flight> itFlight = flightList.iterator();
            int i = 1, opcion;
            String vuelos = "";
            while(itFlight.hasNext()) {
                vuelos += "Vuelo #" + i + ": " + itFlight.next().toString()+ "\n\n";
                i++;
            }
            opcion = Integer.parseInt(JOptionPane.showInputDialog(vuelos + "Ingresar número de vuelo que desea reservar: "));
            
            
            String names, surnames, mail, cellphone;
            int age;
            names = JOptionPane.showInputDialog("Ingresar nombres del pasajero");
            surnames = JOptionPane.showInputDialog("Ingresar apellidos del pasajero");
            mail = JOptionPane.showInputDialog("Ingresar correo electronico");
            cellphone = JOptionPane.showInputDialog("Ingresar número de celular");
            age = Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad de pasajero"));
            Flight flight = flightList.get(opcion - 1);
            flight.getPlane().subtractCapacity(1);
            peopleList.add(new People(names, surnames, mail, cellphone, age, flight));
            int ultimoElemento = peopleList.size() - 1;
            JOptionPane.showMessageDialog(null ,"Información de reserva: \n" + peopleList.get(ultimoElemento).toString() + "\n\n");
        }else{
            JOptionPane.showMessageDialog(null ,"No hay vuelos registrados para reservar");
        }
    }

    public ArrayList<Flight> getFlightList(){
        return flightList;
    }

    public ArrayList<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(ArrayList<People> peopleList) {
        this.peopleList = peopleList;
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
