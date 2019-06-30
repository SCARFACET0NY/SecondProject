package text_processor;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem:       ipsum 9 dolor; sit  amet, consectetur adipiscing elit! Mauris dr. vestibulum tincidunt tincidunt. Ut ante urna, faucibus id mauris in, tincidunt tempus magna? Praesent euismod lectus eget neque 37 placerat accumsan... Aenean auctor, arcu vel tristique venenatis, neque augue fermentum lacus, eu semper tellus odio mollis odio. Vestibulum feugiat augue tempus dui scelerisque, nec congue magna tempus. Pellentesque et est facilisis, (porta urna vel), auctor lacus. Quisque iaculis arcu eu diam sodales ultricies. Suspendisse quis nisl fringilla tellus congue volutpat. Sed lacus velit, varius in lorem in, pellentesque rhoncus ipsum. Etiam pellentesque non nunc id porttitor. Integer et ante posuere, sodales felis a, elementum eros. Proin quis pellentesque odio. Nullam malesuada orci sed velit venenatis consectetur. Suspendisse at molestie tortor. Morbi lobortis volutpat mattis. ";
        Parser parser = new Parser();

        parser.parseSentences(text);
        parser.parseWords(text);
        parser.parseSymbols(text);
        parser.parsePunctuationMarks(text);
    }
}
