package text_processor;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Text implements Parsable {
    private List<Sentence> sentences;

    public void parse(String source) {
        source = source.replaceAll("\\s+", " ");
        sentences = new ArrayList<>();

        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
        iterator.setText(source);

        int start = iterator.first();
        for (int end = iterator.next(); end != BreakIterator.DONE; start = end, end = iterator.next()) {
            sentences.add(new Sentence(source.substring(start, end)));
        }
    }

    public List<Sentence> getSentences() {
        return sentences;
    }
}
