public class Motorcycle extends Vehicle{

    private boolean hasSidecar;

    public Motorcycle(String name, int capacity, int numberOfWheels, boolean hasSidecar) {
        super(name, capacity, numberOfWheels);
        this.hasSidecar = hasSidecar;
    }

    public String performWheelie(){
        return "I can perform a wheelie";
    }

    public String performWheelie(int durationiInSeconds){
        return "I can perform a wheelie for " + durationiInSeconds + " seconds.";
    }

    public String performStoppie(){
        return "I can perform a stoppie";
    }

    @Override
    public String descriptionOfVehicle(){
        return "This is a " + name + " with " + numberOfWheels + " wheels, seating for " + capacity + " people and it is " + hasSidecar + " that it has a side care.";
    }

}
