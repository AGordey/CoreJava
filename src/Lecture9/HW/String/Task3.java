package Lecture9.HW.String;

public class Task3 {
    public static void main(String[] args) {
        String str = "ава " +
                "ротор " +
                "куджн " +
                "жига " +
                "казак " +
                "шалаш " +
                "бура ";
         String[] strings = str.split(" ");
         StringBuffer stringsWithPolindromes = new StringBuffer();
         for (String word: strings ) {
             StringBuffer wordrevers = new StringBuffer(word).reverse();
             if (word.equals(wordrevers.toString()))
                 stringsWithPolindromes.append(word).append(" ");
         }
        System.out.println(String.valueOf(stringsWithPolindromes));

    }
}
