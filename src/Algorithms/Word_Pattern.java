package Algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ggjjl1 on 10/9/15.
 */
public class Word_Pattern {
    public static boolean wordPattern(String pattern, String str){
        String[] strArr = str.split(" ");
        if(pattern.length() != strArr.length){
            return false;
        }
        Map<String, String> map = new HashMap<String, String>();
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(String.valueOf(pattern.charAt(i)))){
                if(!map.get(String.valueOf(pattern.charAt(i))).equals(strArr[i])){
                    return false;
                }
            }else if(map.containsValue(strArr[i])){
                return false;
            }else{
                map.put(String.valueOf(pattern.charAt(i)), strArr[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        if(wordPattern(pattern, str)){
            System.out.println("模式匹配！");
        }else{
            System.out.println("不匹配");
        }
    }
}
