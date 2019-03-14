package jvm.model;

import java.util.Random;

/**
 * @anthor joey
 * @date 2019/3/10 19:29
 */
public class PermGenErrTest {
    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            getRandomString(1000000).intern();
        }
        System.out.println("Complete");
    }

    private static String getRandomString(int length) {
        String str="abcdefghijklmnopqrstuvwxyz0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(36);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
