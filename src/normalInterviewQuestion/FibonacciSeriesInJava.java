package normalInterviewQuestion;

import java.util.Scanner;

public class FibonacciSeriesInJava {

	static int num1 = 0, num2 = 1, num3=0;
	
	public static void getFibonacci(int num) {
		if(num>0) {
		
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.println(" " + num3);
			getFibonacci(num-1);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the num till you want to get fibonacci starting from 0:");
		Scanner sc = new Scanner(System.in);
		int upperNum = sc.nextInt();
		sc.close();
		System.out.println(num1 + "\n" + num2);
		FibonacciSeriesInJava.getFibonacci(upperNum-2);
	}

}
