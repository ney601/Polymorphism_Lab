import java.util.ArrayList;

public class MotorShop {

    private ArrayList<Vehicle> vehicles;

    public MotorShop(){
        this.vehicles = new ArrayList<>();
    }

    public int countVehicles(){
        return this.vehicles.size();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        this.vehicles.remove(vehicle);
    }

}
