package com.ggjjl1.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class GoatLatin {
    public String toGoatLatin(String sentence) {
        List<String> wordList = new ArrayList<>();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            StringBuilder newWrod = new StringBuilder();
            if ("aeiou".indexOf(words[i].toLowerCase().charAt(0)) >= 0) {
                newWrod.append(words[i]);
            } else {
                newWrod.append(words[i].substring(1, words[i].length()));
                newWrod.append(words[i].charAt(0));
            }
            newWrod.append("ma");
            for (int j = 0; j < i + 1; j++) {
                newWrod.append("a");
            }
            wordList.add(newWrod.toString());
        }
        return String.join(" ", wordList);
    }

    public static void main(String[] args) {

        String sentence = "I speak Goat Latin";
        GoatLatin goatLatin = new GoatLatin();
        System.out.println(goatLatin.toGoatLatin(sentence));

    }
}
