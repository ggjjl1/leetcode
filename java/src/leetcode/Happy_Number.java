package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by gaojunliang on 8/2/15.
 */
public class Happy_Number {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        int s = 0;
        while(!set.contains(n)) {
            if (n == 1) {
                return true;
            }
            set.add(n);
            s = 0;
            while (n / 10 != 0) {
                s = s + (n % 10) * (n % 10);
                n = n / 10;
            }
            s = s + (n % 10) * (n % 10);
            n = s;
        }
        return false;
    }
}
