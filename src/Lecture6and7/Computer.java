package Lecture6and7;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String cpu;
    private int ram;
    private int hdd;
    private int resource;
    private int countOn = 0;
    private static boolean sgorel = false;
    private static boolean netuResusra = false;
    private static boolean isWork = false;
    private Scanner scanner;
    private Random random;




    public Computer(String cpu, int ram, int hdd, int resource) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    @Override
    public String toString() {
        return "Компьютер содержит " +
                "процессор модели " + cpu +
                " оперативной памяти " + ram +
                " Гб и жесткий диск " + hdd +
                " ГБ и его ресурс составляет " + resource +
                " циклов";
    }

    public boolean fortune() {
        boolean lucky = false;
        System.out.println("Введи число 0 или 1");
        int a;
        do {
            a = scanner.nextInt();
            if (a < 0 || a > 1) {
                System.out.print("Введи корректное число 0 или 1: ");
            }
        } while (a < 0 || a > 1);
        int b = random.nextInt(2);
        if (a == b) {
            lucky = true;
        }
        return lucky;
    }

    public void on() {
        if (countOn <= resource) {
            if (isWork == false && fortune() == true && sgorel == false) { //условие что комп не включен isWork, что не сгорел sgorel и что он посчастливилось включиться fortune
                System.out.println("Компьютер включился");
                isWork = true;
                countOn++;
            } else if (sgorel == true) {
                System.out.println("Компьютер уже сгоревший, ему конец");
            } else {
                System.out.println("Компьютер сгорел");
                sgorel = true;
            }
        } else {
            System.out.println("Компьютер выработал свой ресурс");
        }
    }

    public void off() {
        if (isWork == true && fortune() == true && sgorel == false) {
            System.out.println("Компьютер выключился");
            isWork = false;
        } else if (sgorel == true) {
            System.out.println("Компьютер сгорел, уже выключать нечего");
        } else if (isWork==false) {
            System.out.println("Компьютер не включен");
        } else {
            System.out.println("Компьютер сгорел ");
            sgorel = true;
        }

    }

    public static void main(String[] args) {
        Computer comp = new Computer("Intel i7", 32, 1000, 4);
    }
}

