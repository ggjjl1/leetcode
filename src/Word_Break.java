import java.util.*;

/**
 * Created by gaojunliang on 7/1/15.
 */
public class Word_Break {
    public boolean wordBreak(String s, Set<String> wordDick){
        int len = 0;
        for(String word: wordDick){
            len += word.length();
        }
        if(s.length() != len){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        String s1 = new String("leet");
        String s2 = new String("code");
        Set<String> dict = new HashSet<String>();
        dict.add(s1);
        dict.add(s2);
    }
}
