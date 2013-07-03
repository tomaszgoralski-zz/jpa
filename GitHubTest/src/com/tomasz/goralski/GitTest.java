package com.tomasz.goralski;

public class GitTest {
	public static void main(String[] args) {
		System.out.println("Hello Git !");
		GitTest.PrintHello();

		Test2 test2 = new Test2();
		test2.setAge("12");
		test2.setName("tomek");

		System.out.println(test2.getName());
	}

	public static void PrintHello() {
		System.out.println("HelloWorld");
	}

}