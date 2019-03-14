package jvm.model;

/**
 * @anthor joey
 * @date 2019/3/10 20:10
 */
public class InternDifference {
    public static void main(String[] args) {
        String s=new String("a");
        s.intern();
        String s2="a";
        System.out.println(s==s2);
        String s3=new String("a")+new String("a");
        s3.intern();
        String s4="aa";
        System.out.println(s3==s4);
    }
}
