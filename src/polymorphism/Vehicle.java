package polymorphism;

public class Vehicle {
    private int speed = 0;
    public void speedUp(){
        this.speed += 10;
    }

    public int getSpeed(){
        return speed;
    }
}
