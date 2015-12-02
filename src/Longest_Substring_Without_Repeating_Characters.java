/**
 * Created by ggjjl1 on 10/18/15.
 */
public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLogestSubstring(String s){
        int len = s.length();
        for(int i=0;i<len;i++){
            
        }
        return 0;
    }

    public boolean isParanStr(String str){
        for(int i=1;i<str.length();i++){
            if(str.length()%i==0){
                StringBuffer sb = new StringBuffer("");
                String subStr = str.substring(0, i);
                for(int j=0;j<str.length()/i;j++) {
                    sb.append(subStr);
                }
                if(sb.toString().equals(str)){
                    return false;
                }
            }
        }
        return true;
    }
}
