package arrayProblemPractice;

public class LargestAndSmallestElementInArray {

	public static void getLargestAndSmallestElement(int[] data) {
		int Largest =data[0];
		int Smallest=data[0];
		
		for(int i=1;i<data.length;i++) {
			
				if(data[i]>Largest) {
					Largest = data[i];
				}
				else if(data[i]<Smallest) {
					Smallest = data[i];
				}
			
		}
		
		System.out.println(Largest);
		System.out.println(Smallest);
	}
	
	public static void main(String[] args) {
		int[] data = {4,5,6,10,6,7,7,8,9};
		LargestAndSmallestElementInArray.getLargestAndSmallestElement(data);

	}
}
