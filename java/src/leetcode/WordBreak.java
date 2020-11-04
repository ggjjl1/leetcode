package leetcode;

import java.util.*;

/**
 * Created by gaojunliang on 7/1/15.
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        List<String> wordList = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            for (int j = 0; j < wordDict.size(); j++) {
                boolean flag = true;
                for (int k = 0; k < wordDict.get(j).length(); k++) {
                    if (i + k > s.length() || s.charAt(i + k) != wordDict.get(j).charAt(k)) {
                        flag = false;
                    }
                }
                if (flag) {
                    wordList.add(wordDict.get(j));
                    i = i + wordDict.get(j).length();
                    break;
                }
            }
        }
        return String.join("", wordList).equals(s);
    }

    public static void main(String[] args) {
        String s = "catsandog";
        List<String> wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        WordBreak wordBreak = new WordBreak();
        System.out.println(wordBreak.wordBreak(s, wordDict));
    }
}
