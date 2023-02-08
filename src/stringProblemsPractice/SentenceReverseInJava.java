package stringProblemsPractice;

import java.util.Scanner;

public class SentenceReverseInJava {
	
	public void reverseSentence(String data) {
		
		String splittedData[] = data.split(" ");
		String revSentence = "";
		for(int i=splittedData.length-1; i>=0 ;i--) {
		   revSentence = revSentence + splittedData[i] + " ";
		}
		System.out.println(revSentence);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Please Enter an Sentence to Reverse:");
		Scanner Sc = new Scanner(System.in);
		String Sentence = Sc.nextLine();
		Sc.close();
		SentenceReverseInJava objName = new SentenceReverseInJava();
		objName.reverseSentence(Sentence);
		
	}

}
