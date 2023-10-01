
import java.util.*;
	
// finding square root of a number using binary search.
	
	public class findSquareRootUsingBinarySearch {
		
		
		  static public int findSquareRootUsingBinarySearch(int number) {
			   int start = 0;
			   int end = number;
			   int mid = start + (end - start)/2;
			   int answer = -1;
			   
			   while(start<=end) {
				 int square = mid*mid;  
				 if (square == number) {
					 return mid;
				 }
				 if(square > number) {
					 end = mid-1;
					 
				 }else {
					 answer = mid;
					 start = mid + 1;
				 }
				 
				 mid = start + (end - start)/2;
				 
				 
			
			   }
			   
			  
			   
			  
			return answer;
			   
		   }

		   public static double morePrecision(int  tempSol,int number,int precision) {
			double answer = tempSol ;
			double factor = 1;
			
			for(int i = 0;i<precision;i++) {
				factor = factor/10;
				
				for(double j = answer ;(j*j)< number; j = j+factor) {
					 		answer = j;
					 		
				}
				
				
		  
			}
			return answer;
		}
		
	    public static void main(String[] args) {
	    
	    	int tempsol = findSquareRootUsingBinarySearch(37);
	    	// System.out.println("The square root is : "+findSquareRootUsingBinarySearch(4));
			System.out.println(morePrecision(tempsol,37,3));
			

	    	
	    	
	    }

}

