package reflect;

import java.sql.SQLOutput;

/**
 * @anthor joey
 * @date 2019/3/8 14:32
 */
public class CLassLoaderChecker {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader m=new MyClassLoader("C:\\Users\\40400\\Desktop\\","myClassLoader");
        Class c=m.loadClass("Wali");

        System.out.println(c.getClassLoader());
        c.newInstance();
    }
}
