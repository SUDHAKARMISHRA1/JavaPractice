package arrayProblemPractice;

public class MinimumAndMaximumElementInArray {

	
	public static void getMinimum(int[] data) {
		int min =data[0];
		int max = data[0];
		for(int i=1;i<data.length;i++) {
		if(data[i]>max) {
			max = data[i];
		} else if(data[i]<min) {
			min = data[i]; 
		}
		}
		System.out.println("Minimum element in array is: "+min);
		System.out.println("Maximum element in array is: "+max);
	}
	
	
	public static void main(String[] args) {
		int[] data = { 1, 1, 20, 4, 3, 0 };
		 MinimumAndMaximumElementInArray.getMinimum(data);
		

	}

}
