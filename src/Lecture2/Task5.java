package Lecture2;

/*
5)Напишите программу печати таблицы перевода расстояний из дюймов в
сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */
public class Task5 {
    public static void main(String[] args) {
//        double sm = 2.54;
//        double perevod=0;
//        for (int i = 1; i<=20; i++) {
//            perevod +=sm;
//            System.out.print(i+" дюймов равны "+perevod+ " сантиметров");
//        }
        double d=2.54;
        double sum=0;
        int y=0;
        int x=0;
        while (x<20){
            x++;
            y+=1;
            sum+=d;
            System.out.println(y+" дюйм - "+ sum + " сантиметров");
        }
    }
}

