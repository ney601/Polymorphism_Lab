public class Plane extends Vehicle{

    private int maxAltitude;

    public Plane(String name, int capacity, int numberOfWheels, int maxAltitude){
        super(name, capacity, numberOfWheels);
        this.maxAltitude = maxAltitude;
    }

    public String takeOff(){
        return "I can take off!";
    }

    public String land(){
        return "I can land!";
    }

    @Override
    public String descriptionOfVehicle(){
        return "This is an " + name + " with " + numberOfWheels + " wheels and seating for " + capacity + " people. It can also fly up to a maximum altitude of " + maxAltitude + " m.";
    }
}
