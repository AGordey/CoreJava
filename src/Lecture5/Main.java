package Lecture5;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMarka("Audi");
        car1.setPrice(27500);
        car1.setSpeed(250);

        Car car2 = new Car();
        car2.setMarka("Audi");
        car2.setPrice(27500);
        car2.setSpeed(250);

        car1.start();
    }
}
