package normalInterviewQuestion;

public class UpperAndLowerCaseCount {

	public static void main(String[] args) {
		String data = " My Name is Khan";
		String cleanData = data.replace(" ", "");
		int upperCase = 0;
		int lowerCase = 0;
		for(int i=0; i<cleanData.length(); i++) {
			if(data.charAt(i) >= 65 && data.charAt(i)<=90) {
				upperCase++;
			}
			else {
				lowerCase++;
			}
			
		}
		System.out.println(upperCase);
		System.out.println(lowerCase);
	}
	
	
}
