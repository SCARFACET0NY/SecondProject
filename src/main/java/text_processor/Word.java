package text_processor;

import java.util.ArrayList;
import java.util.List;

public class Word extends TextElement {
    private List<Symbol> symbols;

    public Word(String value) {
        super(value);
    }

    public void parseSymbols() {
        symbols = new ArrayList<>();

        String[] rawSymbols = getValue().replaceAll("\\W+", "").split("");

        for (String symbol : rawSymbols) {
            symbols.add(new Symbol(symbol));
        }
    }

    public List<Symbol> getSymbols() {
        return symbols;
    }
}
