package Lecture9.HW.Car;


/*
Создать собственное исключение
- Создать класс Car c полями (марка, скорость, цена), конструкторы (с
параметрами и default) гетеры-сетеры.
Создать метод старт в котором пытаетесь завести автомобиль. В методе старт
генерируете случайное число от 0 до 20, если полученное число оказалось
четным, то выбрасываете созданное ранее вами исключение и передаете его к
месту откуда вызывали метод старт. Если все хорошо и исключение не
вылетело, то выводить в консоль сообщение что автомобиль с такой-то маркой
завелся.
В main создаете парочку автомобилей и пытаетесь их завести. И обрабатываете
исключение которое может вылететь при старте автомобиля
*/

import java.util.Random;

public class Car {
    String marka;
    int speed;
    int price;

    static Random random = new Random();

    public Car() {
    }

    public Car(String marka, int speed, int price) {
        this.marka = marka;
        this.speed = speed;
        this.price = price;
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

public void start () throws CarException {
       if(random.nextInt(20)%2!=0) {
           System.out.println("Автомобиль "+ getMarka() +" успешно завелся");
           } else {
           throw new CarException(getMarka());
       }
}
}
