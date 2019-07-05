package text_processor;

import java.util.ArrayList;
import java.util.List;

public class Parser implements Parsable {
    public void parse(String source) {
        Text text = new Text();
        text.parse(source);

        List<Sentence> sentences = text.getSentences();
        printSentences(sentences);
    }

    public void printSentences(List<Sentence> sentences) {
        System.out.println("Parsed " + sentences.size() + " sentences:");
        System.out.println();

        int count = 1;
        for (Sentence sentence: sentences) {
            System.out.println("Sentence: " + count++);
            System.out.println(sentence.getValue());
            System.out.println();

            sentence.parseWords();
            sentence.parsePunctuationMarks();

            printWords(sentence.getWords());
            printPunctuationMarks(sentence.getPunctuationsParks());
        }

        System.out.println();
    }

    public void printWords(List<Word> words) {
        List<Symbol> symbols = new ArrayList<>();

        System.out.println("Parsed " + words.size() + " words:");
        for (Word word : words) {
            System.out.print(word.getValue() + " ");

            word.parseSymbols();
            symbols.addAll(word.getSymbols());
        }
        System.out.println();
        System.out.println();

        printSymbols(symbols);
    }

    public void printSymbols(List<Symbol> symbols) {
        System.out.println("Parsed " + symbols.size() + " symbols:");
        for (Symbol symbol : symbols) {
            System.out.print(symbol.getValue() + " ");
        }
        System.out.println();
        System.out.println();
    }

    public void printPunctuationMarks(List<PunctuationMark> marks) {
        System.out.println("Parsed " + marks.size() + " punctuation marks:");
        for (PunctuationMark mark : marks) {
            System.out.print(mark.getValue() + " ");
        }
        System.out.println();
        System.out.println();
    }
}
