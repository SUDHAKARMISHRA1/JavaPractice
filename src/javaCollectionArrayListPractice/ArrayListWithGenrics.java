package javaCollectionArrayListPractice;

import java.util.ArrayList;

public class ArrayListWithGenrics {

	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(10);
		data.add(20);
		data.add(30);
		
		data.add(22, 1);
		data.set(2, 3);
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		
	}

}
