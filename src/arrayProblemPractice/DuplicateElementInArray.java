package arrayProblemPractice;

public class DuplicateElementInArray {
	
	public static void getDuplicate(int[] data) {
		for(int i=0;i<=data.length-1;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i]==data[j]) {
					System.out.println("Duplicate Element is:" +data[i]);
				}
			}
		}
	}

	
	public static void main(String[] args) {
		int[] data = {4,5,6,6,7,7,8,9};
		DuplicateElementInArray.getDuplicate(data);

	}

}
