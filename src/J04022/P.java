package J04022;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class WordSet{
    private String word;

    public WordSet(String word) {
        this.word = word.toLowerCase();
    }

    public String union(WordSet other) {
        String otherWord = other.word.toLowerCase();
        List<String> words = new ArrayList<>();

        for (String w : this.word.split(" ")) {
            if (!words.contains(w)) {
                words.add(w);
            }
        }
        for (String w : otherWord.split(" ")) {
            if (!words.contains(w)) {
                words.add(w);
            }
        }

        words.sort(Comparator.naturalOrder());
        return String.join(" ", words);
    }

    public String intersection(WordSet other) {
        String otherWord = other.word.toLowerCase();
        List<String> words = new ArrayList<>();

        for (String w : this.word.split(" ")) {
            if (otherWord.contains(w) && !words.contains(w)) {
                words.add(w);
            }
        }
        words.sort(Comparator.naturalOrder());
        return String.join(" ", words);
    }
}

public class P {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
