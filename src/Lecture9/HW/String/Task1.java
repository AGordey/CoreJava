package Lecture9.HW.String;
/*Вырезать подстроку из строки начиная с первого вхождения символа(A) до последнего вхождения символа (B)*/
public class Task1 {
    public static void main(String[] args) {
        String str = "вивапавпЦ Я тебя хотел вырезать Йтпвпвапавп";

        int firstInput = str.indexOf('Я');
        int lastInput = str.lastIndexOf('Й');
         str = str.substring(firstInput, lastInput);
        System.out.println(str);
    }
}
