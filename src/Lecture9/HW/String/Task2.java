package Lecture9.HW.String;

/*Заменить все вхождения символа стоящего в позиции (3) на символ стоящий на позиции 0*/
public class Task2 {
    public static void main(String[] args) {
        String str = "таким образом, сложившаяся структура организации обеспечивает широкому кругу специалистов участие" +
                " в формировании соответствующих условий активизации. Разнообразный и богатый опыт реализация" +
                " намеченного плана развития позволяет выполнить важнейшие задания по разработке позиций," +
                " занимаемых участниками в" +
                " отношении поставленных";
        char charToPut = str.charAt(0);
        char charToReplace = str.charAt(3);
        String charTo = String.valueOf(charToPut).toUpperCase(); //добавил upperCase xчто бы было лучше видно замену
        str = str.replaceAll(String.valueOf(charToReplace), String.valueOf(charTo));
        System.out.println(str);

    }
}
