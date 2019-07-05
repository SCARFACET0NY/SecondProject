package text_processor;

import java.util.ArrayList;
import java.util.List;

public class Sentence extends TextElement {
    private List<Word> words;
    private List<PunctuationMark> punctuationsParks;

    public Sentence(String value) {
        super(value);
    }

    public void parseWords() {
        words = new ArrayList<>();

        String[] rawWords = getValue().replaceAll("\\W+", " ").split(" ");

        for (String word : rawWords) {
            words.add(new Word(word));
        }
    }

    public void parsePunctuationMarks() {
        punctuationsParks = new ArrayList<>();

        String[] rawPunctuationMarks = getValue().replaceAll("\\w+", "").split("\\s+");

        for (String mark : rawPunctuationMarks) {
            if (mark.length() > 0) punctuationsParks.add(new PunctuationMark(mark));
        }
    }

    public List<Word> getWords() {
        return words;
    }

    public List<PunctuationMark> getPunctuationsParks() {
        return punctuationsParks;
    }
}
