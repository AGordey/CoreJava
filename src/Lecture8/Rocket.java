package Lecture8;

import java.util.Random;

public class Rocket {
    private String name;
    private int weight;
    boolean beforeStartCheck = false;

    public void start() {
        System.out.println("Ракета " + getName() + " успешно стартанула с грузом в " + getWeight() + " т.");
    }

    public boolean beforeStartCheck() {
        Random random = new Random();
        int a = random.nextInt(10);
        if (a % 2 == 0) beforeStartCheck = true;
        return beforeStartCheck;
    }

    public Rocket() {
    }

    public Rocket(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

//    public static void main(String[] args) {
//        Rocket rocket = new Rocket("Marusia", 8000);
//        rocket.start();
//    }
}
