package javaCollectionArrayListPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingOverArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(10);
		data.add(20);
		data.add(30);
		data.add(20);
		
		//approach one Normal Loop
		for(int i=0;i<data.size();i++) {
			System.out.println(data.get(i));
		}
		
		System.out.println("************************");
		
		//approach two for each
		for(Integer num : data) {
			System.out.println(num);
		}
		
		System.out.println("************************");
		//approach three using Iterator
		Iterator<Integer> num = data.iterator();
		while(num.hasNext()) {
			System.out.println(num.next());
			
		}

	}

}
