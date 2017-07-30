package java;

/**
 * Created by ggjjl1 on 9/14/15.
 */
public class String_to_Integer {
    /**
     * 需要考虑字符串是否包含正负号，空格，转换后的数字是否超过整型表示范围
     * @param str
     * @return
     */
    public static int myAtoi(String str) {
        if(str.length()==0){
            return 0;
        }
        char[] atoi = str.toCharArray();
        long sum = 0;
        int d = 0;
        int count = 0;
        int j = 0;
        boolean flag = false; //标志位，若为true，则达到整型最大表示范围
        boolean symbol = true; //转换整型后的符号，true为正，false为负
        while(atoi[j] == ' '){
            j++;
        }
        if(atoi[j] == '+'){
            j++;
        }else if(atoi[j] == '-'){
            j++;
            symbol = false;
        }
        if((int)atoi[j]<48 || (int)atoi[j]>57){
            return 0;
        }
        for(int i=j;i<atoi.length;i++){
            if((int)atoi[i]<48 || (int)atoi[i]>57){
                break;
            }
            sum = sum*10 + ((int)atoi[i]-48);
            if(sum>2147483647){
                if(symbol){
                    return 2147483647;
                }else{
                    return -2147483648;
                }
            }
        }
        if(!symbol){
            sum = -sum;
        }
        return (int)sum;
    }

    public static void main(String[] args) {
        System.out.println("结果是 "+1052254545*10);
        System.out.println(myAtoi("    10522545459"));
    }
}
