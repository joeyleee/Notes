package thread;

import java.util.concurrent.Callable;

/**
 * @anthor joey
 * @date 2019/3/12 14:36
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception{
        String value ="test";
        System.out.println("Ready to work");
        Thread.currentThread().sleep(5000);
        System.out.println("task done");
        return value;
    }
}
