package jvm.gc;

/**
 * @anthor joey
 * @date 2019/3/10 21:01
 */
public class ReferenceCounterProblem {
    public static void main(String[] args) {
        MyObject object1=new MyObject();
        MyObject object2=new MyObject();
        object1.childNode=object2;
        object2.childNode=object1;
    }
}
