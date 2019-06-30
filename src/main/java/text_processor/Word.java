package text_processor;

public class Word implements Parsable {
    @Override
    public String[] parse(String text) {
        return text.replaceAll("\\W+", " ").split(" ");
    }
}
