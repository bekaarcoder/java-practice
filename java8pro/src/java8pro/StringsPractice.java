package java8pro;

public class StringsPractice {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "there";
		
		System.out.println(a.charAt(0));
		
		if(b.equals("there")) {
			System.out.println("Printed...");
		}
		
		if(a.equalsIgnoreCase("hello")) {
			System.out.println("Case Ignored...");
		}
	}

}
