package arrays;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		int simple_array[] = new int[5];
		
		ArrayList<Integer> myList = new ArrayList<Integer>(5);
		myList.add(1);
		myList.add(5);
		myList.add(3);
		myList.add(6);
		myList.add(93);
		

		System.out.println(myList.size());
		myList.remove(2);
		
		for (Integer x : myList)
			System.out.println(x);
		
}
}
