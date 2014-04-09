package com.sunnotes.samples.varargs;

//����ʹ���˾�̬����
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
     * ���Ҫ���õķ������Ժ������ɱ����ƥ�䣬����ִ���
     * @param args
     */
    public static void main(String[] args) {
        VarArgsTest1 test = new VarArgsTest1();
        test.print("hello");
        test.print("hello", "alexia");
    }
}
