public class Car extends Vehicle{

    private String transmissionType;

    public Car(String name, int capacity, int numberOfWheels, String transmissionType){
        super(name, capacity, numberOfWheels);
        this.transmissionType = transmissionType;
    }

    @Override
    public String accelerate(){
        return "Car is accelerating!";
    }

    public String openTrunk(){
        return "I can open the trunk.";
    }

    public String addCarPlay(){
        return "I can add Car Play!";
    }

    @Override
    public String descriptionOfVehicle(){
        return "This is a " + transmissionType + " " + name + " with " + numberOfWheels + " wheels and seating for " + capacity + " people.";
    }

}
