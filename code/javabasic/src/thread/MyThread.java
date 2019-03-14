package thread;

/**
 * @anthor joey
 * @date 2019/3/12 13:34
 */
public class MyThread extends Thread{
    private String name;
    public MyThread(String name){
        this.name=name;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread start" + this.name+ "i=" + i);
        }
    }
}
