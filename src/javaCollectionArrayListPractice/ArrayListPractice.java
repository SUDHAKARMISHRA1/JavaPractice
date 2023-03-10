package javaCollectionArrayListPractice;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		//Created an arraylist and stored some random value of different data types
		//it is displaying warning becuase of the generics we have not defined while creating object of arraylist
		
		ArrayList al = new ArrayList();
		al.add("My Name is Sudhakar Mishra");
		al.add("My age is 24");
		al.add(12);
		al.add(12.22);
		
		for(int i =0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
	}
	
	
}
