package arrayProblemPractice;

public class CountNumberOfOccuranceOrFrequencyInSortedArray {
	
	public static void getOccurance(int[] data, int searchFor) {
		int flag =0;
		for(int i=0;i<data.length-1;i++) {
			if(data[i]==searchFor) {
				flag += 1;
			}
		}
		System.out.println(flag);
	}
	
	
	public static void main(String[] args) {
		int[] data = { 1, 1, 3,4,1,1,1,1,1,5,5,7};
		int searchFor = 0;
		CountNumberOfOccuranceOrFrequencyInSortedArray.getOccurance(data, searchFor);
		

	}

}
