package normalInterviewQuestion;

import java.util.Scanner;

public class PalindromeStringInJava {

public static String getPalindrome(String data) {
		
		String revData = "";
		for(int i=data.length()-1;i>=0;i--) {
			revData = revData + data.charAt(i);
		}
		
		return revData;	
	}
	
	public static void main(String[] args) {
		
		System.out.println("Please Enter a String Data:");
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		sc.close();
		String revData = PalindromeStringInJava.getPalindrome(data);
	   
		if(data.equals(revData)) {
			
			System.out.println("Given String value " + data + " is a Palindrome String");
		}
		
		else {
			System.out.println("Given String value " + data + " is not a Palindrome String");	
		}

}
}