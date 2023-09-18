
import java.util.*;



public class BinarySearch {
	

   static public int BinarySearch(int arr[],int key) {
	   int start=0;
	   int end = arr.length-1;
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
	  
 

	public static void main(String[] args) {
		
		
		int[] odd = {4,5,10,15,100};
		int[] even = {3,7,11,13,50,60};
		
		
	System.out.println("the index of 4 is : " + BinarySearch(odd,4));
		
	System.out.println("the index of 6 is : " + BinarySearch(even,7));
		
		 
		
	}
}

