package reservationsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Iterator;

public class ReservationSystem {

    public static void main(String[] args) {
    
        ArrayList<Airline> listaAerolinea = new ArrayList<>();
        
        int opcion = 0;
        
        do{
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                      Menu
                                                                      1. Crear Aerolinea
                                                                      2. Crear vuelo
                                                                      3. Ver Aerolineas
                                                                      4. Salir
                                                                      Elige una opción:"""));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null ,"Debes ingresar un numero entero valido");
            }
            switch(opcion){
                case 1 ->  {
                    String name, identificationCode, phone;
                    name = JOptionPane.showInputDialog("Ingresar nombre de la aerolinea");
                    identificationCode = JOptionPane.showInputDialog("Ingresar código de identificación de la aerolinea");
                    phone = JOptionPane.showInputDialog("Ingresar Telefono de la aerolinea");
                    
                    listaAerolinea.add(new Airline(name, identificationCode, phone));
                    
                    JOptionPane.showMessageDialog(null ,"Ahora por favor ingresa los aviones que va a tener la aerolinea");
                    int ultimoElmento = listaAerolinea.size() - 1;
                    listaAerolinea.get(ultimoElmento).addPlane();
                }
                
                case 2 ->  {
                    Iterator<Airline> itAerolinea = listaAerolinea.iterator();
                    int i = 1;
                    String aerolineas = "";
                    if(listaAerolinea.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No hay aerolineas registradas");
                    }else{
                        while(itAerolinea.hasNext()) {
                            aerolineas += "Aerolinea #" + i + ": " + itAerolinea.next().toString()+ "\n\n";
                            i++;
                        }
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(aerolineas + "Ingresar número de aerolinea para agregar un vuelo: "));
                        listaAerolinea.get(opcion - 1).addFlight();
                    }
                }
                
                case 3 ->  {
                    Iterator<Airline> itAerolinea = listaAerolinea.iterator();
                    int i = 1;
                    String aerolineas = "";
                    while(itAerolinea.hasNext()) {
                        aerolineas += "Aerolinea #" + i + ": " + itAerolinea.next().toString()+ "\n\n";
                        i++;
                    }
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(aerolineas + "Ingresar número de aerolinea en la cual desea reservar un vuelo: "));
                    listaAerolinea.get(opcion - 1).reserveFlight();
                }
                
                case 4 ->  {
                    JOptionPane.showMessageDialog(null ,"Proceso terminado");
                }
                
                default -> {
                     JOptionPane.showMessageDialog(null ,"La opcion ingresada no esta en el menu");
                }
                
            }
        }while(opcion != 4); 
    }
}
