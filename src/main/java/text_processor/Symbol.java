package text_processor;

public class Symbol implements Parsable {

    @Override
    public String[] parse(String text) {
        return text.replaceAll("\\W+", "").split("");
    }
}
