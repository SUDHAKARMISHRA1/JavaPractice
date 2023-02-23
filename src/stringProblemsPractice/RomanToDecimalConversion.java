package stringProblemsPractice;

public class RomanToDecimalConversion {

	public static int getDecimal(String Roman) {
		int val = 0;
		switch (Roman) {
		case "I":
			val = 1;
		case "II":
			val = 2;
			break;
		case "III":
			val = 3;
		case "IV":
			val = 4;
		case "V":
			val = 5;
		case "VI":
			val = 6;
		case "VII":
			val = 7;
		case "VIII":
			val = 8;
		case "IX":
			val = 9;
		case "X":
			val = 10;
		}
		return val;

	}

	public static void main(String[] args) {
		int num = RomanToDecimalConversion.getDecimal("");
		System.out.println(num);
	}

}
