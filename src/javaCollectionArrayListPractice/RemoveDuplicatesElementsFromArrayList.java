package javaCollectionArrayListPractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesElementsFromArrayList {

	/*We will follow the approach like first converting the ArrayList data to LinkedHashSet
	 *  and then linkedHashset to ArrayList
	 * we can not use HashSet because it does not maintain insertion order
	 * if data order is not important as an output we can use HashSet
	 */
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(10);
		data.add(20);
		data.add(30);
		data.add(20);
		
		Set<Integer> uniqueData = new LinkedHashSet<Integer>();
		uniqueData.addAll(data);
	
		ArrayList<Integer> newData = new ArrayList<Integer>();
		newData.addAll(uniqueData);
		
		System.out.println(newData);
		
	}
}
