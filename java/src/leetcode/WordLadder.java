package leetcode;

import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        boolean[] used = new boolean[wordList.size()];
        int layer = 1;
        while (!queue.isEmpty()) {
            layer++;
            int size = queue.size();
            while (size-- > 0) {
                String word = queue.poll();
                for (int i = 0; i < wordList.size(); i++) {
                    String tmpWord = wordList.get(i);
                    if (!used[i] && canTransfer(word, tmpWord)) {
                        if (tmpWord.equals(endWord)) return layer;
                        used[i] = true;
                        queue.add(tmpWord);
                    }
                }
            }
        }
        return 0;
    }

    public boolean canTransfer(String word1, String word2) {
        int diff = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diff++;
            }
        }
        return diff == 1;
    }

    public static void main(String[] args) {
        String beginWord = "hit", endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
        WordLadder wordLadder = new WordLadder();
        System.out.println(wordLadder.ladderLength(beginWord, endWord, wordList));
    }
}
