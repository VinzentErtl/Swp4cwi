package at.evi.plane;

public class Eurofighter extends Plane{


    public Eurofighter(float height, float width, float maxspeed, int seats, float weight, float wingspan, String color) {
        super(height, width, maxspeed, seats, weight, wingspan, color);
    }

    public void shoot(){
        System.out.println("The Eurofighter is shooting!");
    }

}
