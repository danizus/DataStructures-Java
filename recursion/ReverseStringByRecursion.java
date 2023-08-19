


// reversing a string using recursion
public class ReverseStringByRecursion{
	
	public static String reverseString(String originalString){
		//base case
        
		if(originalString.isEmpty()) {
			return originalString ;
		}
        //recursive case
		
		return reverseString(originalString.substring(1)) + originalString.charAt(0);
		
		
		
		}
	public static void main(String[] args) {
		
	     System.out.println("the reversed string is : "+reverseString("DANIYAL"));
		
	}
}

