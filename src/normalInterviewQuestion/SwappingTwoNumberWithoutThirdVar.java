package normalInterviewQuestion;

public class SwappingTwoNumberWithoutThirdVar {

	public static void swapNum(int a, int b) {
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The Value of a after Swapping is: " +a);
		System.out.println("The Value of b after Swapping is: " +b);
		
		
	}
	
	public static void main(String[] args) {
		int a =20;
		int b=40;
		SwappingTwoNumberWithoutThirdVar.swapNum(a, b);
		

	}
}
