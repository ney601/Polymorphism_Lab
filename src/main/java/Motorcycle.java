public class Motorcycle extends Vehicle{

    private boolean hasSidecar;

    public Motorcycle(String name, int capacity, int numberOfWheels, boolean hasSidecar) {
        super(name, capacity, numberOfWheels);
        this.hasSidecar = hasSidecar;
    }

    public String performWheelie(){
        return "I can perform a wheelie";
    }

    public String performStoppie(){
        return "I can perform a stoppie";
    }

}