package Lecture9.HW.Car;

public class CarException extends Exception{
    private String name;

    public CarException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "Произошла ошибка, авто " + name +" не завелся";
    }
}
