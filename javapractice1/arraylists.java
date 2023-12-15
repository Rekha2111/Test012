package javapractice1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class arraylists {
public static void main(String[]args) {
	PriorityQueue<String> list=new PriorityQueue<String>();
	list.add("Mango");
	//list.add("Mango");
	list.add("apple");
	list.add("");
	list.add("grapes");
	System.out.println("head"+list.element());
	//list.element();
	list.remove();
	list.poll();
	System.out.println(list);
	list.add("Donut");
	//System.out.println(list);
	Iterator<String> ref=list.iterator();
	//while(ref.hasNext()) {
		System.out.println(ref.next());
	//}
	
}
}
