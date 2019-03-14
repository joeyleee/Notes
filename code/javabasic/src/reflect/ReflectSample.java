package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @anthor joey
 * @date 2019/3/7 20:16
 */
public class ReflectSample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class rc =Class.forName("reflect.Robot");
        Robot r=(Robot)rc.newInstance();
        System.out.println("Class name is "+rc.getName());
        Method getHello=rc.getDeclaredMethod("throwHello", String.class);
        getHello.setAccessible(true);
        Object str=getHello.invoke(r,"Bob");
        System.out.println("getHello result is "+str);
        Method sayHi=rc.getMethod("sayHi",String.class);
        sayHi.invoke(r,"Welcome");
        Field name=rc.getDeclaredField("name");
        name.setAccessible(true);
        name.set(r,"Alice");
        sayHi.invoke(r,"Welcome");
    }
}
