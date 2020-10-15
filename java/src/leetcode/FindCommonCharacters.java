package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    public List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        String firstWord = A[0];
        for (int i = 0; i < firstWord.length(); i++) {
            String tempString = String.valueOf(firstWord.charAt(i));
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j].contains(tempString)) {
                    count++;
                    A[j] = A[j].replaceFirst(tempString, "");
                }
            }
            if (count == A.length) {
                result.add(tempString);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] A = {"bella", "label", "roller"};
        FindCommonCharacters findCommonCharacters = new FindCommonCharacters();
        List<String> result = findCommonCharacters.commonChars(A);
        for (String element : result) {
            System.out.println(element);
            ;
        }
    }
}
