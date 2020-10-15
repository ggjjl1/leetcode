package leetcode;

import java.awt.*;

/**
 * Created by gaojunliang on 7/29/15.
 */
public class RectangleArea {
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int total_area = (C-A)*(D-B)+(G-E)*(H-F);
        if(C <= E || G <= A || D <= F || H <= B){
            return total_area;
        }else if(A <= E && E <= C){
            if(A <= G && G <= C){
                if(B <= F && F <= D){
                    if(B <= H && H <= D){
                        return total_area-(G-E)*(H-F);
                    }else{
                        return total_area-(D-F)*(G-E);
                    }
                }else{
                    if(B <= H && H <= D) {
                        return total_area - (H - B) * (G - E);
                    }else{
                        return total_area-(D-B)*(G-E);
                    }
                }
            }else{
                if(B <= F && F <= D){
                    if(B <= H && H <= D){
                        return total_area-(C-E)*(H-F);
                    }else{
                        return total_area-(D-F)*(C-E);
                    }
                }else{
                    if(B <= H && H <= D){
                        return total_area-(H-B)*(C-E);
                    }else{
                        return total_area-(D-B)*(C-E);
                    }
                }
            }
        }else if(A <= G && G <= C){
            if(B <= F && F <= D){
                if(B <= H && H <= D){
                    return total_area-(H-F)*(G-A);
                }else{
                    return total_area-(G-A)*(D-F);
                }
            }else{
                if(B <= H && H <= D) {
                    return total_area - (G - A)* (H - B);
                }else{
                    return total_area-(D-B)*(G-A);
                }
            }
        }else if(C <= G){
            if(B <= F && F <= D){
                if(B <= H && H <= D){
                    return total_area-(C-A)*(H-F);
                }else{
                    return total_area-(C-A)*(D-F);
                }
            }else if(B <= H && H <= D){
                return total_area-(C-A)*(H-B);
            }
        }
        return total_area-(C-A)*(D-B);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.intersects(-3, 0, 3, 4);
        System.out.println(rect.getCenterX());
    }
}
