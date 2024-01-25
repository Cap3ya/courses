import java.util.ArrayList;

public class SimpleDictionary {
    private ArrayList<String[]> dictionary;

    public SimpleDictionary() {
        this.dictionary = new ArrayList<>(); 
    }

    public void add(String word, String translation) { 
        String[] entry = {word, translation};
        this.dictionary.add(entry);
    }

    public String translate(String word) {
        for (String[] strings : dictionary) {
            if (strings[0].equals(word)) {
                return strings[1];
            }
        }
        return "Unknown word";
    }
}
