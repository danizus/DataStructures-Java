
import java.util.*;



public class sortZeroesAndOnes {
	

   static public int[] sortZeroesAndOnes(int arr[]) {
	   int i = 0;
	   int j = arr.length-1;
	  
	   	while(i<j) {
	   		if(arr[i]== 0 && arr[j] == 1 ) {
	   			i++;
	   			j--;
	   		}else if (arr[i] == 0)  {
                 i++;
	   			 }
	   		else if (arr[j] == 1) {
                 j--;
             }
	   		else {	
	   			int temp = arr[i];
	   			arr[i] = arr[j];
	   			arr[j] = temp;
	   			
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
		
		int[] arr = {1,0,0,1,1,0,1,1,0,0,0,0};
		
	print((sortZeroesAndOnes(arr)));	
		
		
		 
		
	}
}

