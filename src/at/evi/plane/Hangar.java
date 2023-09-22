package at.evi.plane;

import java.util.ArrayList;
import java.util.List;

public class Hangar {
    private float height;
    private float width;
    private float length;
    private int SerialNumber;
    private float price;
    private String color;
    private int capacity;


    private List<Plane> planes =new ArrayList<Plane>();
    public Hangar(float height, float width, float length, int serialNumber, float price, String color, int capacity, Plane plane) {
        this.height = height;
        this.width = width;
        this.length = length;
        SerialNumber = serialNumber;
        this.price = price;
        this.color = color;
        this.capacity = capacity;
        this.planes.add(plane);
    }





    public void removePlane(Plane plane){
        this.planes.add(plane);
        System.out.println("The plane" + plane + "has been removed!");
    }

    public void storePlane(Plane plane){
        this.planes.add(plane);
        System.out.println("The plane" + plane + "has been stored!");
    }
}
