package Lecture9.Lesson;

public class Lesson {
    public static void main(String[] args)  {
        System.out.println("++++++");
        try {
            int a= 6;
            int b= 0;
            int c= a/b;
            System.out.println(c);
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("-----");
    }
}
