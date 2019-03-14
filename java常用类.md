* [java常用类](#java常用类)
    * [java异常体系](#java异常体系)
    * [多线程原理](#多线程原理)

  
# java多线程与并发
## java异常体系
1. Error和Exception的区别：
<div align=center>

![java异常体系](pics/79.png)
</div><br>

    Error:程序无法处理的系统错误，编译器不做检查
    Exception:程序可以处理的异常，捕获后可能恢复
    总结:前者是程序无法处理的错误，后者是可以处理的异常
2. RuntimeException：不可预知的，程序应当自行避免，非RuntimeException：可预知的，从编译器校验的异常
3. 常见Error以及Exception：

       NullPointerException:空指针引用异常
       ClassCastException:类型强制转换异常
       IllegalArgumentException：传递非法参数异常
       IndexOutOfBoundsException：下界越界异常
       NumberFormatException：数字格式异常

       非RuntimeException：
       ClassNotFoundException：找不到指定class异常
       IOException：IO操作异常