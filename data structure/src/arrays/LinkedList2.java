package arrays;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList<Integer> linky = new LinkedList<Integer>();
		
		linky.add(6);
		linky.add(4);
		linky.add(1);
		
		linky.remove();
		
		linky.getFirst();
		
		System.out.println(linky.get(1));
		
		Iterator it = linky.iterator();
		
		while(it.hasNext()) {
			if((int)it.next() == 4) {
				System.out.println("We found 78");
			}
		}
		
	}
}
