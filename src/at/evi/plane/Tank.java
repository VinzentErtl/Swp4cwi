package at.evi.plane;

public class Tank {
    private float capacity;
    private String fueltype;
    private float fuelAmount;
    private float fuelConsumption;
    private float weight;
    private float height;
    private float price;

    public Tank(float capacity, String fueltype, float fuelAmount, float fuelConsumption, float weight, float height, float price) {
        this.capacity = capacity;
        this.fueltype = fueltype;
        this.fuelAmount = fuelAmount;
        this.fuelConsumption = fuelConsumption;
        this.weight = weight;
        this.height = height;
        this.price = price;
    }

    public void getFuelAmount(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("The current fuel Amount is " + fuelAmount);
    }
}
