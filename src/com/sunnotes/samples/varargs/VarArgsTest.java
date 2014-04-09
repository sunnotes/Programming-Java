package com.sunnotes.samples.varargs;
/**
 * eason
 * 2014-04-09
 */


//这里使用了静态导入
import static java.lang.System.out;

public class VarArgsTest {

 public void print(String... args) {
     for (int i = 0; i < args.length; i++) {
         out.println(args[i]);
     }
 }

 public void print(String test) {
     out.println("----------");
 }

 public static void main(String[] args) {
     VarArgsTest test = new VarArgsTest();
     test.print("hello");
     test.print("halo", "alexia");
 }
}