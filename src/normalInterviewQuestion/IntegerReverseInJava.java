package normalInterviewQuestion;

import java.util.Scanner;

public class IntegerReverseInJava {

	public static void getReverse(int num) {

		int revNum = 0;
		
		while(num!=0) {
			
			revNum = revNum *10 + num % 10;
			num = num/10;
		}
		
		System.out.println("The Reverse of the num "+num+ "is: " +revNum);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Please Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		IntegerReverseInJava.getReverse(num);

	}

}
