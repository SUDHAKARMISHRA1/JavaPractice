package normalInterviewQuestion;

public class SwappingTwoNumberUsingThirdVar {

	public static void swapNum(int a, int b) {
		int temp;
		temp =a;
		a=b;
		b=temp;
		System.out.println("The Value of a after Swapping is: " +a);
		System.out.println("The Value of b after Swapping is: " +b);
		
		
	}
	public static void main(String[] args) {
		int a =20;
		int b=40;
		SwappingTwoNumberUsingThirdVar.swapNum(a, b);
		

	}

}
