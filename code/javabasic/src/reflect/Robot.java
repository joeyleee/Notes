package reflect;

import java.sql.SQLOutput;

/**
 * @anthor joey
 * @date 2019/3/7 20:06
 */
public class Robot {
    private String name;
    public void sayHi(String helloSentence){
        System.out.println(helloSentence+" "+name);
    }
    private String throwHello(String tag){
        return "Hello "+ tag;
    }
    static{
        System.out.println("Hello Robot");
    }
}
