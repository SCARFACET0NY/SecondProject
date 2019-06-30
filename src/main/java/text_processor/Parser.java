package text_processor;

import java.util.Arrays;

public class Parser {
    public String[] parseSentences(String text) {
        String[] sentences = new Sentence().parse(text);

        System.out.println("Parsed " + sentences.length + " sentences:");
        for (String sentence: sentences) {
            System.out.println(sentence);
        }
        System.out.println();

        return sentences;
    }

    public String[] parseWords(String text) {
        String[] words = new Word().parse(text);

        System.out.println("Parsed " + words.length + " words:");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
        System.out.println();

        return words;
    }

    public String[] parseSymbols(String text) {
        String[] symbols = new Symbol().parse(text);

        System.out.println("Parsed " + symbols.length + " symbols:");
        for (String symbol : symbols) {
            System.out.print(symbol + " ");
        }
        System.out.println();
        System.out.println();

        return symbols;
    }

    public String[] parsePunctuationMarks(String text) {
        String[] marks = new PunctuationMark().parse(text);

        System.out.println("Parsed " + marks.length + " punctuation marks:");
        for (String mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        System.out.println();

        return marks;
    }
}
