package reservationsystem;

public class People {
    
    private String names;
    private String surnames;
    private String mail;
    private String cellphone;
    private int age;
    private Flight flight;
           
    public People(String names, String surnames, String mail, String cellphone, int age, Flight flight){
        this.names = names;
        this.surnames = surnames;
        this.mail = mail;
        this.cellphone = cellphone;
        this.age = age;
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "\nNombres: " + names 
                + "\nApellidos: " + surnames 
                + "\nCorreo: " + mail 
                + "\nTelefono: " + cellphone 
                + "\nEdad: " + age + "\n"
                + flight.toString();
    }
}
