package javaCollectionArrayListPractice;

import java.util.ArrayList;

public class ReversingArrayList {

	/* we have follow the approach to iterate over the array from end
	 * to start and add data to new ArrayList one by one
	 */
	
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(10);
		data.add(20);
		data.add(30);
		
		
		ArrayList<Integer> reverseData = new ArrayList<Integer>();
		
		for(int i=data.size()-1;i>=0;i--) {
			reverseData.add(data.get(i));
		}
		System.out.println(reverseData);
		
	}

}
