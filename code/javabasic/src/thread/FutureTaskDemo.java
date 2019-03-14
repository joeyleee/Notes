package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @anthor joey
 * @date 2019/3/12 14:38
 */
public class FutureTaskDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task=new FutureTask(new MyCallable());
        new Thread(task).start();
        if(!task.isDone()){
            System.out.println("task has not finished,please wait!");
        }
        System.out.println("task return :"+ task.get());
    }
}
