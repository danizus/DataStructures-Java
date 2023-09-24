
import java.util.*;


// using binary search

	public class FindPeakElementInMountainArray {
		  public static int peakIntegerInMountainArray(int[] array) {
		        int start = 0;
		        int end = array.length-1;
		        int mid = start + (end - start)/2; 
		       
		        while(start<end){
		        	if(array[mid] < array[mid + 1]) {
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
	    	int array[] = {1,2,5,6,4,3,1};
	    	
	    	System.out.println(peakIntegerInMountainArray(array));
	    	
	    	
	    }

}

