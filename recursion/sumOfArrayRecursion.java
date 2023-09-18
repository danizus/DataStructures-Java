
import java.util.*;



public class sumOfArrayRecursion{
	

   static public int sum(int arr[], int index) {
	   
	   int  sum;
	 
	  ;
	   // 1 base case
	   if(index>= arr.length) { //3 
		   return 0;
		   
	   }
	   // recursive case
	   // {1,2,3}
	 return sum = arr[index] + sum(arr,index+1);
	 
	   
   }
	  
   

	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		System.out.println(sum(arr,0)); //6
		
		
		 
		
	}
}

