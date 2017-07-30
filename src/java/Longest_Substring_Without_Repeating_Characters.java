package java;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ggjjl1 on 10/18/15.
 */
public class Longest_Substring_Without_Repeating_Characters {
    public static int lengthOfLogestSubstring(String s){
        int maxSubStrLen = 0;
        for(int i=0;i<s.length();i++){
            int subStrLen = 0;
            Set wordSet = new HashSet();
            for(int j=i;j<s.length();j++){
                if(wordSet.contains(s.charAt(j))){
                    String newSubStr = s.substring(i, j);
                    if(newSubStr.length() > maxSubStrLen){
                        maxSubStrLen = newSubStr.length();
                    }
                    break;
                }else{
                    wordSet.add(s.charAt(j));
                    subStrLen++;
                }
                if(subStrLen>maxSubStrLen){
                    maxSubStrLen = subStrLen;
                }
            }
        }
        return maxSubStrLen;
    }

    public static void main(String[] args) {
        String testStr = "aa";
        System.out.println(lengthOfLogestSubstring(testStr));
    }
}
