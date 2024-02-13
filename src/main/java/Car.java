public class Car extends Vehicle{

    private String transmissionType;

    public Car(String name, int capacity, int numberOfWheels, String transmissionType){
        super(name, capacity, numberOfWheels);
        this.transmissionType = transmissionType;
    }

    public String openTrunk(){
        return "I can open the trunk.";
    }

    public String addCarPlay(){
        return "I can add Car Play!";
    }

}
