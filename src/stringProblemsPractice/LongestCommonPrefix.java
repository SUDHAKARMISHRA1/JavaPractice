package stringProblemsPractice;

public class LongestCommonPrefix {
	
	public String longestCommonPrefixFinder(String[] data, int len) {
		  String prefix = data[0];
		  
	        for (int i = 1; i <= len - 1; i++) {
	            prefix = prefixFinder(prefix, data[i]);
	        }
	 
	        return (prefix);
		}
	
	public String prefixFinder(String data, String data2) {
		String prefixWord = "";
		for(int i=0,j=0; i<data.length()-1 && j<data2.length()-1; i++,j++) {
				if(data.charAt(i) !=data2.charAt(j))
				break;
				prefixWord += data.charAt(i);
		}
		
		return prefixWord;
		
	}
	
	public static void main(String[] args) {
		String[] data = {"aappllle", "aapplllope", "aappointment"};
		int len = data.length;
		LongestCommonPrefix objName = new LongestCommonPrefix();
		String prefixData = objName.longestCommonPrefixFinder(data, len);
		
		 if (prefixData.length() > 0) {
	            System.out.printf("The longest common prefix is",
	            		prefixData);
	        } else {
	            System.out.printf("no common prefix");
	        }
	}

}
