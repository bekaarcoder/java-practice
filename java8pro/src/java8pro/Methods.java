package java8pro;

import AnotherPackage.AnotherClass;

public class Methods {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		printStuff();
//		int result = Test.add10(100);
//		System.out.println(result);
		System.out.println(AnotherClass.doSomething());

	}
	
	public static void printStuff() {
		System.out.println("random stuff");
	}

}
