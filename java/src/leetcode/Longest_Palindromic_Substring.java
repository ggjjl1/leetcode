package leetcode;

/**
 * Created by ggjjl1 on 7/1/17.
 */
public class Longest_Palindromic_Substring {
    public static String longestPalindrome(String s) {
        int max_length = 1;
        int position = 0;
        int n = 2*s.length()-1;

        for(int i=0;i<n;i++){
            int tmp_length = 0;
            int left = 0;
            int right = 0;
            if(i%2==0){
                tmp_length = 1;
                left = i/2 - 1;
                right = i/2 + 1;
            }else{
                left = i/2;
                right = i/2 + 1;
            }

            while(left>=0 && right <= s.length()-1 && s.charAt(left) == s.charAt(right)){
                tmp_length = tmp_length + 2;
                left--;
                right++;
            }
            if(tmp_length>=max_length){
                max_length = tmp_length;
                position = i;
            }
        }

        String max_string = null;

        if(position%2==0){
            int r = max_length/2;
            max_string = s.substring(position/2-r, position/2+r+1);
        }else{
            int r = max_length/2;
            max_string = s.substring(position/2-r+1,position/2+r+1);
        }

//        System.out.println(max_length);

        return max_string;
    }

    public static void main(String[] args) {
        long start_time = System.currentTimeMillis();

//        System.out.println(longestPalindrome("babad"));
//        System.out.println(longestPalindrome("cbbd"));
//        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
//        System.out.println("babad".substring(0, 0));

        long end_time = System.currentTimeMillis();
        System.out.println("运行时间："+(end_time-start_time)+"ms");
    }
}
