
import java.util.*;


// quickSort Using Recursion
public class quickSortByRecursion {
	
	 
	public  static int partition(int array[], int start, int end) {
		
		int count = 0;
		int pivot =  array[start];
		for(int i=start+1;i<=end;i++) {
			if(pivot>array[i]) {
				count++;
			}
		}
		
	int pivotIndex = start+count;
	//	place the pivot at the right index
		int temp = array[pivotIndex];
		array[pivotIndex] = pivot;
		array[start] = temp;
		

	// sort the left and right part of the pivot 
		
		
		int i = start;
		int j = end;
		
		while(i< pivotIndex && j>pivotIndex) {
			
			while(array[i] < pivot) {
			
				i++;
				
			}
			while(array[j] > pivot) {
				j--;
			}
			if(i < pivotIndex && j > pivotIndex) {
				int temp1 = array[i];
				array[i] = array[j];
				array[j] = temp1;
			
			}
		}
	return pivotIndex;
	}
	
	
	
	public static void quickSort(int array[], int start, int end){
	
		//base case - already sorted 
		if(start>=end) {
			
			return;
		}
		// partitioning the array 
		int p = partition(array,start,end);
	
		
		// sorting the left partition
		
		quickSort(array,start,p-1);
		
		
		// sorting the right partition
		
		quickSort(array,p+1,end);
		
		

	
		}
	
	
		
	
	// utility function to print the array 
	static void print(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		// printing the original array
        
		int array[] = {10,3,4,2,5,6};
		System.out.println("original array :");
		print(array);
		System.out.println(" ");
    	// function call

		quickSort(array,0,5);
		System.out.println("sorted array : ");
		print( array);
		
		
		 
		
	}
}

