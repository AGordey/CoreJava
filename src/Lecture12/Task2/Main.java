package Lecture12.Task2;
/*
2) Проверка на цензуру:
Создаете 2 файла.
1 - й. Содержит исходный текст.
2 - й. Содержит слова недопустимые в тексте(black list). Структура файла определите сами, хотите каждое слово на новой
строке, хотите через запятую разделяйте, ваша программа делайте как считаете нужным.
Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не встретилось ни одного недопустимого слова, то
выводите сообщение о том, что текст прошёл проверку на цензуру. Если нет, то выводите соответствующее сообщение, кол-во
предложений не прошедших проверку и сами предложения подлежащие исправлению.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        try {
            List<String> allTextList = Files.readAllLines(Paths.get("src/Lecture12/Task2/file_with_text.txt"));

            List<String> wordsFromBlackList = Files.readAllLines(Paths.get("src/Lecture12/Task2/black_list.txt"));

            List<String> sentences = new ArrayList<>(); // список предложений разделенных по точке
            for (String sentence : allTextList) {

                String[] splitSentences = sentence.split("\\.");
                sentences.addAll(Arrays.asList(splitSentences));
            }

            Set<String> sentencesForCorrect = new HashSet<>(); // список предложений для исправлений и без повторов
//            List<String> sentencesForCorrect = new ArrayList<>(); // список предложений для исправлений и без повторов
            for (String blackWord : wordsFromBlackList) {
                for (String sentence : sentences) {
                    if (sentence.contains(blackWord)) {
                        sentencesForCorrect.add(sentence);

                    }
                }
            }
            if (!sentencesForCorrect.isEmpty()) { // Если кол-во предложений 0
                System.out.println(sentencesForCorrect.size() + " количество предложений для корректировки");
                for (String sentence : sentencesForCorrect) {
                    System.out.println(sentence);
                }
            } else {
                System.out.println("Проверка на цензуру прошла успешно");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
