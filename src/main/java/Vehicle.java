public abstract class Vehicle {

    private String name;
    private int capacity;
    private int numberOfWheels;

    public Vehicle(String name, int capacity, int numberOfWheels){
        this.name = name;
        this.capacity = capacity;
        this.numberOfWheels = numberOfWheels;
    }

    public boolean start(){
        return true;
    }

    public boolean accelerate(){
        return true;
    }

    public boolean brake(){
        return true;
    }

}
