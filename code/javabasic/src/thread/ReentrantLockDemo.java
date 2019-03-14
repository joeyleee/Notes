package thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @anthor joey
 * @date 2019/3/13 20:17
 */
public class ReentrantLockDemo implements Runnable {
    private static ReentrantLock lock=new ReentrantLock(true);
    @Override
    public  void run(){
        while(true){
            try{
                lock.lock();
                System.out.println(Thread.currentThread().getName()+"get lock");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }
    public static void main(String[] args) {
            ReentrantLockDemo rtld=new ReentrantLockDemo();
            Thread thread1=new Thread(rtld);
            Thread thread2=new Thread(rtld);
            thread1.start();
            thread2.start();

    }
}
