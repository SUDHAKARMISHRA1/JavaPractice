package normalInterviewQuestion;

import java.util.Scanner;

public class PrimeNumberInJava {

	public static void checkForPrime(int num) {

		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				System.out.println("Not a Prime Number");
			}else {
				System.out.println("It is a Prime Number");
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Please Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		if(num<=1) {
			System.out.println("1 can only be divided by one number, 1 itself, so with this definition 1 is not a prime number.");
		}
		else if(num==2){
			System.out.println("2 is a Prime Number");
			
		}
		else {
			PrimeNumberInJava.checkForPrime(num);
		}
		

	}

}
