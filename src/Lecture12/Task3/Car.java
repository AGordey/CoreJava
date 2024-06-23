package Lecture12.Task3;

import Lecture9.HW.Car.CarException;

import java.io.Serializable;
import java.util.Random;

public class Car implements Serializable {
    String marka;
    int speed;
    int price;
    private static final long serialVersionUID = 1L;

     public Car() {
    }

    public Car(String marka, int speed, int price) {
        this.marka = marka;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
