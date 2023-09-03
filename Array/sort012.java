
import java.util.*;

// this code sorts 0s 1s and 2s using 3 pointer approach that are low high and mid

public class sort012 {
	

   static public int[] sort012(int arr[]) {
	   int low = 0;
	   int high = arr.length-1;
	   int mid = 0;
	  
	   	
	   		while(mid<= high) {
	   			if(arr[mid] == 0) {
	   				int temp = arr[low];
		   			arr[low] = arr[mid];
		   			arr[mid] = temp;
		   			mid++;
		   			low++;
	   			}else if(arr[mid] == 1) {
	   				mid++;
	   			}else {
	   				int temp = arr[high];
		   			arr[high] = arr[mid];
		   			arr[mid] = temp;
		   			high--;
	   			}
	   		
	   	
	   	}
	
	   return arr;
    	
    
   }
	
	static void print(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		int[] arr = {1,2,0,1,0,2,2,2,1,0};
		
	print((sort012(arr)));	
		
		
		 
		
	}
}

