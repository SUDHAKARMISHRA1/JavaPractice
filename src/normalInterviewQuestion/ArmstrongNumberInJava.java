package normalInterviewQuestion;

import java.util.Scanner;

public class ArmstrongNumberInJava {

	public static void getArmstromg(int num) {

		int cube = 0;
		int rev = 0;
		int temp = 0;

		temp = num;

		while (num != 0) {
			rev = num % 10;
			num = num / 10;
			cube = cube + (rev * rev * rev);
		}

		if (temp == cube) {
			System.out.println("Number " + temp + " is Armstrong");
		} else {
			System.out.println("Number " + temp + " is not Armstrong");
		}

	}

	public static void main(String[] args) {

		System.out.println("Please Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		ArmstrongNumberInJava.getArmstromg(num);
	}
}
