/**
 * Created by ggjjl1 on 9/14/15.
 */
public class String_to_Integer {
    public static int myAtoi(String str) {
        if(str.length()==0){
            return 0;
        }
        char[] atoi = str.toCharArray();
        int sum = 0;
        int count = 0;
        for(int i=0;i<atoi.length;i++){
            if((int)atoi[i]>=48 && (int)atoi[i]<=57){
                sum = sum*10 + ((int)atoi[i]-48);
                count++;
            }
        }
        if(atoi.length==count){
            return sum;
        }else if(atoi.length==count+1){
            if(atoi[0] == '-'){
                return -sum;
            }
            if(atoi[0] == '+'){
                return sum;
            }
            return 0;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        char a = '1';
        System.out.println((int)a);
        System.out.println(myAtoi("1"));
    }
}
