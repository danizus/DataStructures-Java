


// check if a word is a palindrome using recursion
public class checkPalindrome {
	
	public static boolean checkPalindrome(String originalString,int startingPoint,int endingPoint){
		//base case
		if(startingPoint > endingPoint ) {
			return true;
			
		}
		

		if(originalString.charAt(startingPoint) != originalString.charAt(endingPoint) ) {
			return false ;
		}
		// recursive case
		
		return checkPalindrome(originalString,startingPoint+1,endingPoint-1);
		
		
		
		}
	public static void main(String[] args) {
		
	     if(checkPalindrome("abba",0,3)) {
	    	 System.out.println("is palindrome");
	     }else {
	    	 System.out.println("not palindrome");
	     }
		
	}
}

