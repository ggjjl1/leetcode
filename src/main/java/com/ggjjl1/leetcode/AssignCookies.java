package leetcode;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int r = 0;
        boolean[] used = new boolean[s.length];
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (!used[j] && s[j] >= g[i]) {
                    r++;
                    used[j] = true;
                    break;
                }
            }
        }
        return r;
    }
}
