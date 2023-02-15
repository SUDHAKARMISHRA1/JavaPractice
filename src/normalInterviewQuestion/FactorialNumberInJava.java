package normalInterviewQuestion;

import java.util.Scanner;

public class FactorialNumberInJava {

	public static int getFactorial(int num) {

        if(num==0){
            return 1;
        }
        else{
            return (num*getFactorial(num-1));
        }


	}

	public static void main(String[] args) {

		System.out.println("Please Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int fact = FactorialNumberInJava.getFactorial(num);
		System.out.println("The factorial is: " +fact);
	}
}
