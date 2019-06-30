package text_processor;

public class PunctuationMark implements Parsable {
    @Override
    public String[] parse(String text) {
        return text.replaceAll("\\w+", "").split("\\s+");
    }
}
