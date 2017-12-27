package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("hello");
		words.add("world");
		words.add("foo");
		words.add("fighters");
		
		ArrayList<String> words2 = new ArrayList<String>();
		words2.add("hello");
		words2.add("elf");
		
		words.removeAll(words2);
		
		Iterator itr = words.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
