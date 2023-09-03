
import java.util.*;


// this program finds the sum of 3 numbers in an array that is equal to the given number s
public class sumOfTriplets {
	

   static public ArrayList <Integer> sumOfTriplets(int arr[],int s) {
	   
	   ArrayList <Integer> list  = new ArrayList <>();
	   for(int i = 0;i<arr.length;i++) {
		   for(int j = i+1; j<arr.length;j++) {
			  for(int k = j+1; k<arr.length;k++) 
				 if(arr[i]+arr[k]+arr[j] == s) {
					 list.add(arr[i]);
				   list.add(arr[j]);
				   list.add(arr[k]);
			   }
		   }
		   
	   }
	
	return list;
	
	   
    	
    
   }
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,5};
		
	System.out.println((sumOfTriplets(arr,6)));	
		
		
		 
		
	}
}

