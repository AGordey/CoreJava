package Lecture12.Task3;

import java.io.*;

/*
3)Сеарилизовать объект Автомобиль(Марка, скорость, цена). После сериализации произвести обратный процесс.
*/
public class Main {
    public static void main(String[] args) {
            Car car = new Car("Audiuha",250,15000 );
//Сериализовал объект
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/Lecture12/Task3/fileWithCar.bin"))) {
           oos.writeObject(car);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//Десериализовал объект
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Lecture12/Task3/fileWithCar.bin"))) {
            Car car1 = (Car) ois.readObject();
            System.out.println("Считан объект из файла\n" + car1);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
