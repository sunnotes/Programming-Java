/**
 * 2014��4��9��
 * @author EASON
 */
package com.sunnotes.samples.varargs;

public class VarArgsTest2 {

	public static void m1(String s, String... ss) {
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
	}

	public static void main(String[] args) {

		m1("");
		m1("aaa");
		m1("aaa", "bbb");
	}
}