import java.util.Arrays;
import java.util.Collections;

/**
 * Created by gaojunliang on 8/2/15.
 */
public class Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char chs[] = s.toCharArray();
        Arrays.sort(chs);
        String s1 = new String(chs);
        char cht[] = t.toCharArray();
        Arrays.sort(cht);
        String t1 = new String(cht);
        if(s1.equals(t1)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "helloworld!";
        String t = "world!hello";
        if(isAnagram(s,t)){
            System.out.println("同位字符串");
        }else{
            System.out.println("不是");
        }
    }
}
