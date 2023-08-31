package reservationsystem;

import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Iterator;

public class ReservationSystem {

    public static void main(String[] args) {
    
        ArrayList<Airline> listaAerolinea = new ArrayList<>();
        
        
        int opcion;
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Crear Aerolinea\n 2. Crear vuelo \n 3. Crear Pasajero \n Elige una opción:"));
            
            switch(opcion){
                case 1: {
                    String name, identificationCode, phone;
                    name = JOptionPane.showInputDialog("Ingresar nombre de la aerolinea");
                    identificationCode = JOptionPane.showInputDialog("Ingresar código de identificación de la aerolinea");
                    phone = JOptionPane.showInputDialog("Ingresar Telefono de la aerolinea");
                    
                    Airline aLinea = new Airline(name, identificationCode, phone);
                }
                
                case 2: {
                    
                }
                
                case 3: {
                    
                }
                
                default: {
                    
                }
                
            }
            
        }while(opcion != 0); 
   
    }
}
