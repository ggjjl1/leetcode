package leetcode;

import java.util.*;

public class WordBreak2 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new ArrayList<>();
        Set<String> wordSet = new HashSet<>(wordDict);
        if (s.length() > 0) {
            findWord(s, wordSet, new ArrayList<>(), result);
        }
        return result;
    }

    public void findWord(String str, Set<String> wordSet, List<String> words, List<String> result) {
        if (str.length() == 0) {
            result.add(String.join(" ", words));
            return;
        }

        for (int i = 1; i <= str.length(); i++) {
            String word = str.substring(0, i);
            if (wordSet.contains(word)) {
                words.add(word);
                findWord(str.substring(i), wordSet, words, result);
                words.remove(words.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
//        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
//        List<String> wordDict = Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa");
        String s = "catsanddog";
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");
        WordBreak2 wordBreak2 = new WordBreak2();
        List<String> r = wordBreak2.wordBreak(s, wordDict);
        System.out.println(Arrays.toString(r.toArray()));

    }
}
