package text_processor;

public abstract class TextElement {
    private String value;

    public TextElement(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
