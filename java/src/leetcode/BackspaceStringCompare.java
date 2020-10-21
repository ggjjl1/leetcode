package leetcode;

public class BackspaceStringCompare {
    public static boolean backspaceCompare(String S, String T) {
        return backspaceString(S).equals(backspaceString(T));
    }

    public static String backspaceString(String str) {

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '#') {
                chars[i] = '_';
                int j = i - 1;
                while (j >= 0) {
                    if (chars[j] != '_') {
                        chars[j] = '_';
                        break;
                    } else {
                        j = j - 1;
                    }
                }
            }
        }

        return new String(chars).replace("_", "");
    }

    public static void main(String[] args) {
        String S = "ab##";
        String T = "c#d#";
        System.out.println(backspaceCompare(S, T));
    }
}
