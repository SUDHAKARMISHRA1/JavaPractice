package setProblemPractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {
	
	public static void getDuplicate(int[] num) {
		
		Set<Integer> refVars = new HashSet<Integer>();
		for(int datafetch:num) {
			
			if(refVars.add(datafetch)==false) {
				System.out.println("Duplicate Element is: " +datafetch);
			}
		}
		
	}

	
	public static void main(String[] args) {
		int[] num = {4,5,6,6,7,7,8,9};
		DuplicateElementInArray.getDuplicate(num);

	}

}
