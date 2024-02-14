public abstract class Vehicle {

    protected String name;
    protected int capacity;
    protected int numberOfWheels;

    public Vehicle(String name, int capacity, int numberOfWheels){
        this.name = name;
        this.capacity = capacity;
        this.numberOfWheels = numberOfWheels;
    }

    public abstract String descriptionOfVehicle();

    public boolean start(){
        return true;
    }

    public String accelerate(){
        return "The car can accelerate";
    }

    public boolean brake(){
        return true;
    }

}
