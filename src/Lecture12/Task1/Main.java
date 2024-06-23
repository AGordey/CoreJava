package Lecture12.Task1;

/*1)В исходном файле находятся слова, каждое слово на новой стороке. После запуска программы должен создать файл,
который будет содержать в себе только полиндромы*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> list = Files.readAllLines(Paths.get("src/Lecture12/Task1/text.txt"));
            System.out.println("Считали из файла");
            System.out.println(list);
            List<String> polindrome = new ArrayList<>();
            Iterator<String> iterator = list.iterator();

            while (iterator.hasNext()) {
                String word = iterator.next();
                if (word.equals(new StringBuffer(word).reverse().toString())) {
                    System.out.println(word);
                    polindrome.add(word);
                }
            }
            Files.write(Paths.get("src/Lecture12/Task1/polindromes.txt"), polindrome);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}