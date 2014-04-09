package com.sunnotes.samples.varargs;

//这里使用了静态导入
import static java.lang.System.out;

/**
 * @author EASON
 *
 */
public class VarArgsTest1 {

	public void print(String... args) {
        for (int i = 0; i < args.length; i++) {
            out.println(args[i]);
        }
    }

    public void print(String test,String...args ){
          out.println("----------");
    }

    /**
     * 如果要调用的方法可以和两个可变参数匹配，则出现错误
     * @param args
     */
    public static void main(String[] args) {
        VarArgsTest1 test = new VarArgsTest1();
        test.print("hello");
        test.print("hello", "alexia");
    }
}
