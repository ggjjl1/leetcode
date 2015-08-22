/**
 * Created by gaojunliang on 8/4/15.
 */
public class Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))) {
                sb.append(String.valueOf(s.charAt(i)).toLowerCase());
            }
            if(Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        String str = sb.toString();
        if(sb.reverse().toString().equals(str)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String t = "race a car";
        if(isPalindrome(s)){
            System.out.println("s is true");
        }
        if(isPalindrome(t)){
            System.out.println("t is true");
        }
    }
}
