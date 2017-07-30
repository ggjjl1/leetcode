package java;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by gaojunliang on 8/6/15.
 */
public class Test_MD5 {
    public static void main(String[] args) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String str = "helloafasddddddf";
            byte[] inputByte = str.getBytes();
            messageDigest.update(inputByte);
            System.out.println(messageDigest.digest());
        } catch(NoSuchAlgorithmException e){
            e.printStackTrace();
        }
    }
}
