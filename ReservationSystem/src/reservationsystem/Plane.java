package reservationsystem;

public class Plane {
    private String serialNumber;
    private String planeModel;
    private int capacity;
    
    public Plane(String serialNumber, String planeModel, int capacity) {
        this.serialNumber = serialNumber;
        this.planeModel = planeModel;
        this.capacity = capacity;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getPlaneModel() {
        return planeModel;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return  "Numero de serie: " + serialNumber 
                + "\nModelo avion: " + planeModel 
                + "\nCapacidad de avion: " + capacity;
    }
}
