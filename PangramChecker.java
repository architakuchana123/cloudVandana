import java.util.*;
public class PangramChecker {

    private static final Set<Character> ALPHABET = new HashSet<Character>();

    static {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            ALPHABET.add(ch);
        }
    }

    public static boolean isPangram(String sentence) {
        Set<Character> sentenceCharacters = new HashSet<Character>();
        for (char ch : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                sentenceCharacters.add(ch);
            }
        }

        return sentenceCharacters.equals(ALPHABET);
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(sentence);
        System.out.println("Sentence \"" + sentence + "\" is a pangram: " + isPangram);
    }
}
