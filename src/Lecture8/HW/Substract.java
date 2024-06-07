package Lecture8.HW;

public class Substract implements Operation {
    private int a;
    private int b;

    public Substract(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public void calculation() {
        System.out.println("Результат вычитания  = " + (a - b));
    }
}
