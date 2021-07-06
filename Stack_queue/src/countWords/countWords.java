package countWords;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class countWords {
    public static Map<String, Integer> count(String s) {
        Map<String, Integer> wordmap = new TreeMap<>();
        if (s == null) {
            return wordmap;
        }
        int size = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) != ' ' && s.charAt(i) != '\t' && s.charAt(i) != '\n') {
                sb.append(s.charAt(i));
            } else {
                addWord(wordmap, sb);
                sb = new StringBuilder();
            }
        }
        addWord(wordmap, sb);
        return wordmap;
    }

    public static void addWord(Map<String,Integer> wordmap,StringBuilder sb){
        String word = sb.toString();
        if (word.length() == 0) {
            return;
        }
        if (wordmap.containsKey(word)) {
            int count = wordmap.get(word) + 1;
            wordmap.put(word, count);
        } else {
            wordmap.put(word, 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String str = input.nextLine();
        Map<String, Integer> wordMap = count(str);
        for (String key : wordMap.keySet()) {
            System.out.print(key + " " + wordMap.get(key) + "\n");
        }
    }
}
