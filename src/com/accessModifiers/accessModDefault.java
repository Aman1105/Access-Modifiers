package com.accessModifiers;
class B{
	int x = 10;
	public void b1() {
		System.out.println("this is just a print method");
	}
	protected int z = 200;
	protected void ProtectedMethod() {
		System.out.println("This is protected method");
	}
}

public class accessModDefault {

	public static void main(String[] args) {
		B obj = new B();
		int output = obj.z;
		System.out.println("Value of Z is: " + output);
		obj.b1();
		obj.ProtectedMethod();

	}

}
