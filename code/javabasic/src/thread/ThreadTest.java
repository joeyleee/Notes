package thread;

/**
 * @anthor joey
 * @date 2019/3/12 13:20
 */
public class ThreadTest {
    private static void attack(){
        System.out.println("Fight");
        System.out.println("Current Thread is:" + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Thread t=new Thread(){
            @Override
            public void run() {
                attack();
            }
        };
        System.out.println("Current main thread is:" + Thread.currentThread().getName());
        t.start();
    }
}
