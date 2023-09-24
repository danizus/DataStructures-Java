import java.util.*;
	
// finding element in a rotated array or rotated sorted array using pivot element.
// binary search is used
	
	public class findElementInrotatedSortedArrayByPivot {
		
		  public static int getPivot(int[] array) {
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
		        return start;
		        
		        }

		  static public int BinarySearch(int arr[],int key,int start,int end) {
			   
			   int mid = start + (end - start)/2;
			   
			   while(start<=end) {
				 if (arr[mid] == key) {
					 return mid;
				 }
				 if(arr[mid]< key) {
					 start = mid+1;
					 
				 }else {
					 end = mid - 1;
				 }
				 
				 mid = start + (end - start)/2;
				 
				 
			
			   }
			  
			   
			  
			return -1;
			   
		   }
		  
		  public static int findElementInrotatedSortedArrayByPivot(int[] arr,int k) {
			  
			  int pivot = getPivot(arr);
			  if(k>=arr[pivot] && k <= arr[arr.length-1] ) {
				  return BinarySearch(arr,k,pivot,arr.length-1);
			  }
			  else{
				 return   BinarySearch(arr,k,0,pivot-1);
			  }
			  
			 
		  }
		
	    public static void main(String[] args) {
	    	int array[] = {7,9,10,1,2,3};
	    	
	    	System.out.println("The element is at the index : "+findElementInrotatedSortedArrayByPivot(array,2));
	    	
	    	
	    }

}

