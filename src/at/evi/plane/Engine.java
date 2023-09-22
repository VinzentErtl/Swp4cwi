package at.evi.plane;

public class Engine {
    private int horsepower;
    private int serialNumber;
    private float weight;
    private float height;
    private float length;
    private float price;
    private float width;

    public Engine(int horsepower, int serialNumber, float weight, float height, float length, float price, float width) {
        this.horsepower = horsepower;
        this.serialNumber = serialNumber;
        this.weight = weight;
        this.height = height;
        this.length = length;
        this.price = price;
        this.width = width;
    }

    public void start(){
        System.out.println("The motor is starting!");
    }

    public void accelerate(){
        System.out.println("The Motor is speeding up!");
    }
}
