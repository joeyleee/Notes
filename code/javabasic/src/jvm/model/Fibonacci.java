package jvm.model;

/**
 * @anthor joey
 * @date 2019/3/9 15:14
 */
public class Fibonacci {
    public static int fibonacci(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(1000000000));

    }
}
