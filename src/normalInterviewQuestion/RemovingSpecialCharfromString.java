package normalInterviewQuestion;

import java.util.Scanner;

public class RemovingSpecialCharfromString {



	public static String removeSpecialChar(String data) {
		String cleanData =data.replaceAll("[^0-9,A-Z,a-z]", "");
		return cleanData;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Please enter the String:");
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		sc.close();
		String cleanData= RemovingSpecialCharfromString.removeSpecialChar(data);
		System.out.println("String after removal of Special Chars is: " +cleanData);
	}

}
