package Lecture8.HW;

public class Add implements Operation{
     private int a;
     private int b;

    public Add(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void calculation() {
        System.out.println("Результат сложения = " + (a+b));
    }
}
