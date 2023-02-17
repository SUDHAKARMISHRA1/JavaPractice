package normalInterviewQuestion;

public class OneToHundredWithoutUsingLoop {

	public static void generateCount(int x) {
		if(x<=100) {
			System.out.println(x);
			x++;
			generateCount(x);
		}
		else {
			System.out.println("Already Printed required Digit");
		}

	}
	public static void main(String[] args) {
		System.out.println("Printing Count without using loop:");
		OneToHundredWithoutUsingLoop.generateCount(1);
	}

}
