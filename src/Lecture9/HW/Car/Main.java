package Lecture9.HW.Car;

public class Main {
    public static void main(String[] args) throws CarException {

        Car car1 = new Car("Audi", 150, 20000);
        Car car2 = new Car("KIA", 160, 18000);
        Car car3 = new Car("Tesla", 180, 15000);

        try {
            car1.start();
        } catch (CarException e) {
            System.out.println(e.getMessage());
        }
        try {
            car2.start();
        } catch (CarException e) {
            System.out.println(e.getMessage());
        }
        try {
            car3.start();
        } catch (CarException e) {
            System.out.println(e.getMessage());
        }

    }

}
