package at.evi.plane;

import java.util.ArrayList;
import java.util.List;

public class Runway {
    private float length;
    private float width;
    private int capacity;
    private String color;
    private String place;
    private List<Plane> planes = new ArrayList<Plane>();

    public Runway(float length, float width, int capacity, String color, String place, Plane plane) {
        this.length = length;
        this.width = width;
        this.capacity = capacity;
        this.color = color;
        this.place = place;
        this.planes.add(plane);
    }





    public void landPlane(Plane plane){
        this.planes.add(plane);
        System.out.println("The Plane " + plane + "has landed!");
    }

    public void takeoff(Plane plane){
        this.planes.add(plane);
        System.out.println("The Plane " + plane + "takes off!");
    }
}

