
import java.util.*;
public class ReverseArrayByRecursion{
   static public void reverseArray(int arr[], int start,int end) {
	  
	   // 1 base case
	   if(start > end) {  
		   return ;
	   }
	   // recursive case
	   int temp = arr[start];
       arr[start] = arr[end]; 
       arr[end] = temp;
	  
       reverseArray(arr,start+1,end-1);
	   
   }
   public static void print(int arr[]) {
	   for(int i=0;i<arr.length;i++){
		   System.out.print(arr[i]+ " ");
	   }	  
   }
	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		reverseArray(arr,0,2)
		; //6
		print(arr);
		 
		
	}
}

