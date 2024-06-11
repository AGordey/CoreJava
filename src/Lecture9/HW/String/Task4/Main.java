package Lecture9.HW.String.Task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Куда нас заведет кривая американской мечты." +
                "Полность остыть некакого добра ке ке ке казак ." +
                "Джунгли представляют собою раздолье 123 куби андо." +
                "Джиужэится лпвыапав арвапкупиваап енркению." +
                "Хромая кобыла аза.";

        String[] text = str.split("[.!?]");
        System.out.println(Arrays.toString(text));
        System.out.println();
        System.out.println("***  Строки которые я бы записывал в файл  ***");
        for (int i = 0; i < text.length; i++) {
            if (TextFormater.isHavePolindromes(text[i]) ||
                    TextFormater.numberOfWords(text[i]) < 6 &&
                            TextFormater.numberOfWords(text[i]) > 2) {
                System.out.println(text[i]);
            }
        }
    }
}

