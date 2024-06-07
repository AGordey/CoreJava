package Lecture8.HW;

public class Multiply implements Operation {
    private int a;
    private int b;

    public Multiply(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public void calculation() {
        System.out.println("Результат умножения = " + a * b);
    }
}
