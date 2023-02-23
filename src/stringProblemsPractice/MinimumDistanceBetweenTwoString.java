package stringProblemsPractice;

public class MinimumDistanceBetweenTwoString {

	
	public static int getDistance(String[] str1, String one, String two) {
		int indexOne = 0;
		int indexTwo = 0;
		for(int i=0;i<str1.length;i++) {
			if(str1[i]==one) {
				indexOne = i;
				
			} else if(str1[i]==two) {
				indexTwo = i;
				
			} 
				
		}
		System.out.println(indexOne);
		System.out.println(indexTwo);
		int dist = indexTwo - indexOne;
		return dist;
	}
	
	
	public static void main(String[] args) {
		String[] data = {"geeks", "for", "ok", "contribute", "geeks"};
		String one = "geeks";
		String two = "contribute";
		int distance = MinimumDistanceBetweenTwoString.getDistance(data, one, two);
		System.out.println(distance);

	}

}
