package arrayProblemPractice;

public class FindPeakElementWhichIsNotSmallerThenItsNeighbours {

	public static int getPeakElement(int[] data) {
		int n = data.length;
		int peakElement = 0;
		if (n == 1) {
			return 0;
		} else if (data[0] >= data[1]) {
			peakElement = 0;
			return peakElement;
		} else if (data[n - 1] >= data[n - 2]) {
			return n - 1;
		}
		for (int i = 1; i < n - 1; i++) {
			if (data[i - 1] < data[i] && data[i + 1] < data[i]) {
				peakElement = i;
			}
		}
		return peakElement;

	}

	public static void main(String[] args) {
		int[] data = { 1, 3, 20, 4, 1, 0 };
		int position = FindPeakElementWhichIsNotSmallerThenItsNeighbours.getPeakElement(data);
		System.out.println(position);

	}

}
