package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 中文名：单词接龙
 */

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList<>();
        boolean[] indicators = new boolean[wordList.size()];
        Arrays.fill(indicators, true);
        List<String> cache = new ArrayList<>();
        cache.add(beginWord);
        ladder(beginWord, endWord, wordList, indicators, cache, result);
        int d = result.size() > 0 ? result.get(0).size() : 0;
        for (int i = 0; i < result.size(); i++) {
            d = Math.min(d, result.get(i).size());
        }
        return d;
    }

    public void ladder(String currentWord, String targetWord, List<String> wordList, boolean[] indicators,
                       List<String> cache, List<List<String>> result) {
        if (currentWord.equals(targetWord)) {
            result.add(new ArrayList<>(cache));
            return;
        }
        for (int i = 0; i < wordList.size(); i++) {
            if (indicators[i]) {
                String tmpWord = wordList.get(i);
                int differenceCount = 0;
                for (int j = 0; j < currentWord.length(); j++) {
                    if (currentWord.charAt(j) != tmpWord.charAt(j)) {
                        differenceCount++;
                    }
                }
                if (differenceCount == 1 && !cache.contains(tmpWord)) {
                    indicators[i] = false;
                    cache.add(tmpWord);
                    ladder(tmpWord, targetWord, wordList, indicators, cache, result);
                    indicators[i] = true;
                    cache.remove(cache.size() - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        String beginWord = "qa";
        String endWord = "sq";
        List<String> wordList = Arrays.asList("si", "go", "se", "cm", "so", "ph", "mt", "db", "mb", "sb", "kr", "ln", "tm", "le", "av", "sm", "ar", "ci", "ca", "br", "ti", "ba", "to", "ra", "fa", "yo", "ow", "sn", "ya", "cr", "po", "fe", "ho", "ma", "re", "or", "rn", "au", "ur", "rh", "sr", "tc", "lt", "lo", "as", "fr", "nb", "yb", "if", "pb", "ge", "th", "pm", "rb", "sh", "co", "ga", "li", "ha", "hz", "no", "bi", "di", "hi", "qa", "pi", "os", "uh", "wm", "an", "me", "mo", "na", "la", "st", "er", "sc", "ne", "mn", "mi", "am", "ex", "pt", "io", "be", "fm", "ta", "tb", "ni", "mr", "pa", "he", "lr", "sq", "ye");
        WordLadder wordLadder = new WordLadder();
        System.out.println(wordLadder.ladderLength(beginWord, endWord, wordList));

    }
}
