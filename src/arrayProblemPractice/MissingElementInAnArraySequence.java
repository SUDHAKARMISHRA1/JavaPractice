package arrayProblemPractice;

public class MissingElementInAnArraySequence {

	public static void getMissingElement(int[] data) {
		int initialData = data[0];
		int lastData=0;
	
		int sum =0;
		int sum1 =0;
		
		for(int i=0;i<data.length;i++) {
		 lastData = data[i];	
		 sum= sum + data[i];
		}
		
		for(int j=lastData;j>=initialData;j--) {
			sum1 = sum1 + j;
		}
		int missingElement = sum1-sum;
		System.out.println("Missing Element in aray Sequence is: " +missingElement);
	}
	
	public static void main(String[] args) {
		int[] data = {4,5,7,8,9};
		MissingElementInAnArraySequence.getMissingElement(data);

	}

}
