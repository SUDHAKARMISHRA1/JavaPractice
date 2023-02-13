package normalInterviewQuestion;

import java.util.Scanner;

public class PalindromeInJava {

	
	public static int getPalindrome(int num) {
		
		int revNum = 0;
		
		while(num!=0) {
			
			revNum = revNum *10 + num % 10;
			num = num/10;
		}
		return revNum;	
	}
	
	public static void main(String[] args) {
		
		System.out.println("Please Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int revNum = PalindromeInJava.getPalindrome(num);
	   
		if(num == revNum) {
			
			System.out.println("Given Int value " + num + " is a Palindrome number");
		}
		
		else {
			System.out.println("Given Int value " + num + " is not a Palindrome number");	
		}
		
		
	}
	
	
}
