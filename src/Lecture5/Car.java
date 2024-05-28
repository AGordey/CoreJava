package Lecture5;

import java.util.Random;

public class Car {
    private String marka;
    private int speed;
    private int price;
    private boolean isStarted = false;

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

    void start() {
        if (isStarted) { // случай когда уже авто заведен
            return;
        }
        if (!checkSystem()) {
            System.out.println(marka + " сломан ");
            return;
        }
        startEngine();
        System.out.println(marka + " заведен");
        isStarted = true;

    }

    void stop() {
        if (isStarted) {
            System.out.println(marka + " остановился ");
            isStarted = false;
        }
    }

    private boolean checkSystem() {
        Random random = new Random();
        int a = random.nextInt();
        return a % 2 == 0;
    }

    private void startEngine() {
        System.out.println("+++++++++++++++++");
        System.out.println("Двигатель запущен");
        System.out.println("+++++++++++++++++");
    }
}
