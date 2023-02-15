package normalInterviewQuestion;

public class SwappingTwoStringWithoutUsingThirdVar {

public static void swapString(String fname, String lname) {
		
		fname=fname+lname;
		lname= fname.substring(0, fname.length()-lname.length());
		fname = fname.substring(lname.length());
		
		
		System.out.println("The Value of a after Swapping is: " +fname);
		System.out.println("The Value of b after Swapping is: " +lname);
		
		
	}
	
	public static void main(String[] args) {
		String fname= "Rahul";
		String lname= "Raj";
		SwappingTwoStringWithoutUsingThirdVar.swapString(fname,lname);
		

	}
	
	
}
