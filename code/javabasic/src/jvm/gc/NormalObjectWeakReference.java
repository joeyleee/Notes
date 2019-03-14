package jvm.gc;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * @anthor joey
 * @date 2019/3/11 20:25
 */
public class NormalObjectWeakReference extends WeakReference<NormalObject> {
    public String name;
    public NormalObjectWeakReference(NormalObject normalObject, ReferenceQueue<NormalObject> rq){
        super(normalObject,rq);
        this.name=normalObject.name;
    }
    @Override
    protected  void finalize(){
        System.out.println("Finalizing NormalObjectWeakReference" + name);
    }

}
