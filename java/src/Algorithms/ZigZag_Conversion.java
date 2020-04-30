package Algorithms;

/**
 * Created by gaojunliang on 9/18/15.
 */
public class ZigZag_Conversion {
    public static String convert(String s, int numRows){
        if(numRows==1){
            return s;
        }
        int n = 2*numRows - 2;
        StringBuffer sb = new StringBuffer("");
        for(int i=0;i<s.length();i=i+n){
            sb.append(s.charAt(i));
        }
        for(int j=1;j<numRows-1;j++){
            for(int k=j;k<s.length();k=k+n) {
                sb.append(s.charAt(k));
                if (n+k-2*j < s.length()) {
                    sb.append(s.charAt(n+k-2*j));
                }
            }
        }
        for(int m=numRows-1;m<s.length();m=m+n){
            sb.append(s.charAt(m));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }
}
