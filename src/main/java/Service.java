import interfaces.ISell;

public abstract class Service implements ISell {

    public static void main(String[] args) {
        Vehicle car = new Car("Mercedes", 5, 4, "Automatic");
        Vehicle motorcycle = new Motorcycle("Royal Enfield", 2, 2, true);
        Vehicle plane = new Plane("Aeroplane", 6, 4, 1500);

        ISell carSeller = (ISell) car;
        ISell motorcycleSeller = (ISell) motorcycle;
        ISell planeSeller = (ISell) plane;

        carSeller.checkEngine();
        planeSeller.checkWiring();
        motorcycleSeller.sellingTires(4);
    }
}
