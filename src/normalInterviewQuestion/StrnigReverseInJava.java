package normalInterviewQuestion;

import java.util.Scanner;

public class StrnigReverseInJava {

	public static void reverseString(String data) {
		
		String revData = "";
		int dataLen = data.length();
		
		for (int i=dataLen-1; i>=0; i--) {
			revData = revData + data.charAt(i);
			
		}
		
		System.out.println("The reverse of given String is: " +revData);
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Please enter the String:");
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		sc.close();
		StrnigReverseInJava.reverseString(data);
		
	}
	
	
}
