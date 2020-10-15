package leetcode;

/**
 * Created by ggjjl1 on 7/4/17.
 */
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max_volume = 0;
        int tmp_volume = 0;

        if (height[i] < height[j]) {
            max_volume = height[i] * (j - i);
        } else {
            max_volume = height[j] * (j - i);
        }

        while (i < j) {
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }

            if (height[i] < height[j]) {
                tmp_volume = height[i] * (j - i);
            } else {
                tmp_volume = height[j] * (j - i);
            }

            if (tmp_volume >= max_volume) {
                max_volume = tmp_volume;
            }
        }

        return max_volume;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] height = {1, 2, 3, 4, 5, 6};
        System.out.println(maxArea(height));

        long end = System.currentTimeMillis();
        System.out.println("运行时间: " + (end - start) + "ms");
    }
}
