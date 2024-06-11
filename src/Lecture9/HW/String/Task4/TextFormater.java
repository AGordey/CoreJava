package Lecture9.HW.String.Task4;

public class TextFormater {

    public static int numberOfWords(String str) {
        String[] words = str.split(" ");
        int a = words.length;
        return a;
    }

    public static boolean isHavePolindromes(String str) {
        boolean isHavePolindromes = false;
        String[] strings = str.split(" ");
        for (String word : strings) {
            StringBuffer wordrevers = new StringBuffer(word).reverse();
            if (word.equals(wordrevers.toString()))
                isHavePolindromes = true;
        }
        return isHavePolindromes;
    }
}
