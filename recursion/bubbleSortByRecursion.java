
import java.util.*;


// bubbleSort Using Recursion
public class bubbleSortByRecursion {
	
	public static void bubbleSortUsingRecursion(int array[],int size){
		//base case - already sorted
		if(size == 0 || size==1) {
			return ;
		}
		
		//processing
		for(int i=0;i<size-1;i++) {
			if(array[i]>array[i+1]) {
				int temp = array[i];
				array[i]= array[i+1];
				array[i+1] = temp;
			}
		}
		// recursive case
		bubbleSortUsingRecursion(array,size-1);

		
		
		
		
		
		}
	public static void main(String[] args) {
		
		int array[] = {10,3,4,2,5};
		int size= array.length;
		bubbleSortUsingRecursion(array,size);
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+ " "); 
		}
		
		 
		
	}
}

