package Lecture8.HW;

public class Devide implements Operation{
    private int a;
    private int b;

    public Devide(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void calculation() {
        System.out.println("Результат умножения = " + a/b);
    }
}
