package at.evi.plane;

public class Main {
    public static void main(String[] args) {

        Eurofighter ef1 = new Eurofighter(4,5,1000,2,12000,20,"grey");

        Plane p1 = new Plane(10,5,8005,200,20000,50,"green");

        Engine e1 = new Engine(4500,2222,120000,4,5,11000,3);
        Engine e2 = new Engine(5000,1111,12000,5,5,20000,5);

        Tank t1 = new Tank(2000,"Diesel",2000,400,50,2,1200);

        Hangar h1 = new Hangar(100,200,400,1234567,1234568,"black",4,p1);
        Runway r1 = new Runway(1000,200,1,"grey","LA",p1);

        p1.setEngine(e1);
        e1.start();
        p1.start();
        e1.accelerate();
        p1.fly();
        p1.land();



        h1.removePlane(p1);
        h1.storePlane(p1);
        r1.takeoff(ef1);
        r1.landPlane(ef1);


        ef1.shoot();

        t1.getFuelAmount();

    }
}
