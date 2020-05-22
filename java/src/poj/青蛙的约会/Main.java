package poj.青蛙的约会;

import java.util.*;

/**
poj 1061 青蛙的约会 */

public class Main {
  
  // 求最大公约数
  public long gcd(long a, long b) {
    if(b==0){
      return a;
    }
    return gcd(b, a%b);
  }

  // 取模运算
  public long mod(long a, long b) {
    if(a*b<0){
      a = -a;
      b = -b;
    }
    return a % b;
  }

  public static void main(String[] args) throws Exception {
    // Scanner in = new Scanner(System.in);
    // long x = in.nextLong();
    // long y = in.nextLong();
    // long m = in.nextLong();
    // long n = in.nextLong();
    // long L = in.nextLong();
    // in.close();
    // Main mn = new Main();
    // long d = mn.gcd(L, m-n);
    // if((x-y)%d == 0){
    //   for(long t=0;t<L;t++) {
    //     if((m-n)*t%L == (x-y)){
    //       System.out.printf("%d, %d %n", m-n, (m-n)*t%L);
    //       System.out.printf("%d %n", t);
    //       break;
    //     }
    //   }
    // }
    // else {
    //   System.out.println("Impossible");
    // }
    Main mn = new Main();
    System.out.println(-7 % 4);
  }
}
