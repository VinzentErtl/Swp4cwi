package at.evi.plane;

public class Plane {
    protected float height;
    protected float width;
    protected float maxspeed;

    private Engine engine;
    private Hangar hangar;
    private Runway runway;
    protected int seats;
    protected float weight;
    protected float wingspan;
    protected String color;

    public void start(){
        System.out.println("The Plane is starting!");
    }

    public void land(){
        System.out.println("The plane is landing!");
    }

    public void fly(){
        System.out.println("The plane is flying!");
    }

    public Plane(float height, float width, float maxspeed, int seats, float weight, float wingspan, String color) {
        this.height = height;
        this.width = width;
        this.maxspeed = maxspeed;
        this.seats = seats;
        this.weight = weight;
        this.wingspan = wingspan;
        this.color = color;
    }

    public float getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(float maxspeed) {
        this.maxspeed = maxspeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
