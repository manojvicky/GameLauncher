package com.headfirst.playground;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.setij(2, 3);
		b.setij(9, 8);
		System.out.println("A i "+ a.geti());
		System.out.println("A j "+ a.getj());
		System.out.println("B i "+ b.geti());
		System.out.println("B j "+ b.getj());
	}

}
