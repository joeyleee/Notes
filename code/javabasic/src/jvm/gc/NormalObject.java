package jvm.gc;

/**
 * @anthor joey
 * @date 2019/3/11 20:23
 */
public class NormalObject {
    public String name;
    public NormalObject(String name){
        this.name=name;
    }
    @Override
    public void finalize(){
        System.out.println("Finalizing obj"+name);
    }
}
