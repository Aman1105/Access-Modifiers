package com.accessModifiers;
class A {
	int x = 100;
}
public class accessModifiers {

	public static void main(String[] args) {
		A obj = new A();
		int output = obj.x;
		System.out.println("Output is: " + output);

	}

}
