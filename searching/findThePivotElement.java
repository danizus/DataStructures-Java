import java.util.*;
	
// using binary search

	public class findThePivotElement {
		  public static int findThePivotElement(int[] array) {
		        int start = 0;
		        int end = array.length-1;
		        int mid = start + (end - start)/2; 
		       
		        while(start<end){
		        	if(array[mid] > array[0]) {
		        		start = mid+1;
		        	}
		        	else {
		        		end = mid;
		        	}
		        	mid = start + (end - start)/2; 
		        }
		        return array[start];
		        
		        }
		
		
	    public static void main(String[] args) {
	    	int array[] = {7,9,10,1,2,3};
	    	
	    	System.out.println(findThePivotElement(array));
	    	
	    	
	    }

}

