package leetcode;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by gaojunliang on 7/21/15.
 */
public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t){
        int len_s = s.length();
        int len_t = t.length();
        HashMap<String, String> map = new HashMap<String, String>();
        if(len_s != len_t){
            return false;
        }
        int len = len_s;
        for(int i=0;i<len;i++){
            if(map.containsKey(String.valueOf(s.charAt(i)))) {
                if (!map.get(String.valueOf(s.charAt(i))).equals(String.valueOf(t.charAt(i)))) {
                    return false;
                }
            }else{
                Set<String> kset = map.keySet();
                for(String key:kset){
                    if(String.valueOf(t.charAt(i)).equals(map.get(key))){
                        if(!key.equals(String.valueOf(s.charAt(i)))){
                            return false;
                        }
                    }
                }
                map.put(String.valueOf(s.charAt(i)), String.valueOf(t.charAt(i)));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr1 = {"egg", "foo", "paper"};
        String[] arr2 = {"add", "bar", "title"};
        for(int i=0;i<3;i++){
            if(isIsomorphic(arr1[i], arr2[i])){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}
