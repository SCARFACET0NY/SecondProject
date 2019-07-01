package tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static String changeWordsWithSpecifiedLength(String text, String line, int length) {
        return text.replaceAll("\\b\\w{" + length + "}\\b", line);
    }

    static List<String> sortWordsThatStartWithVowel(String text) {
        List<String> words = new ArrayList<>();
        text = text.replaceAll("\\W+", " ");
        text = text.toLowerCase();

        for (String word : text.split(" ")) {
            if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") ||
                word.startsWith("o") || word.startsWith("u") || word.startsWith("y"))
            words.add(word);
        }

        words.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(1) - o2.charAt(1);
            }
        });

        return words;
    }

    public static void main(String[] args) {
        String text = "Lorem: ipsum 9 dolor; sit amet, consectetur adipiscing elit!";

        System.out.println(changeWordsWithSpecifiedLength(text, "task 16", 5));
        System.out.println(sortWordsThatStartWithVowel(text));
    }
}
