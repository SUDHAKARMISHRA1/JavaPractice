package stringProblemsPractice;

import java.util.Arrays;
import java.util.Scanner;

public class AnargamsCheckOnString {

	public static void checkAnargams(String one, String two) {
		String cleanDataOne= one.replaceAll("\\s", "");
		String cleanDataTwo= two.replaceAll("\\s", "");
		
		char[] sortedDataOne = cleanDataOne.toUpperCase().toCharArray();
		char[] sortedDataTwo = cleanDataTwo.toUpperCase().toCharArray();
		Arrays.sort(sortedDataOne);
		Arrays.sort(sortedDataTwo);
		if(cleanDataOne.length()!=cleanDataTwo.length()) {
			System.out.println("Given String " + one + " and " +two+ " is not Anargams");
		} else if(Arrays.equals(sortedDataOne, sortedDataTwo)) {
			System.out.println("Given String " + one + " and " +two+ " is Anargams");
		} else {
			System.out.println("Given String " + one + " and " +two+ " is not Anargams");
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Please Enter the words to Check:");
		Scanner Sc = new Scanner(System.in);
		String FirstWord = Sc.nextLine();
		String SecondWord = Sc.nextLine();
		Sc.close();
		
		AnargamsCheckOnString.checkAnargams(FirstWord, SecondWord);
	}

}
