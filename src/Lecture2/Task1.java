package Lecture2;

/*
1)Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
суммарный путь пробежит спортсмен за 7 дней?
 */
public class Task1 {
    public static void main(String[] args) {
        double distance=10;
        double sum=10;
        for (int i=1; i<7; i++) {
//            System.out.println("Пробежал в "+ i +" день дистанцию " + distance );
            distance += distance*0.1;
            sum += distance;
        }
        System.out.println(sum);
    }
    }
