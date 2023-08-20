
// for more information on mergesort visit the website below
// https://www.geeksforgeeks.org/merge-sort/


import java.util.*;


// mergeSort Using Recursion
public class mergeSortByRecursion {
	
	public static void mergeSortUsingRecursion(int array[]){
	int n = array.length;
	
		//base case - already sorted 
		if(n<=1) {
			return;
		}
		// calculate the mid of the array
		int mid = n/2;
		
		
		int[] left = new int[mid];
		int[] right = new int[n-mid];
		
		// copy data in to left and right array
		
		for(int i = 0;i<mid;i++) {
			left[i] = array[i];
		}
		for(int j = mid;j<n;j++) {
			right[j-mid] = array[j];
		}
		//recursive case
		
		mergeSortUsingRecursion(left);
		mergeSortUsingRecursion(right);
		
		 merge(array,left,right);

	
		}
	
	static void merge(int array[],int left[],int right[] ) {
		
		int n1 = left.length;
		int n2 = right.length;
		int i = 0;
		int j = 0;
		int k = 0;
		// compairing elements
		while(i<n1 & j<n2) {
			if(left[i]<=right[j]){
				array[k] = left[i];
				i++;
				
			}else {
				array[k] = right[j];
				j++;
			}
			k++;
		}
		//copying the remaining elements
		while(i<n1) {
			array[k] = left[i];
			i++;
			k++;
		}
		while(j<n2) {
			array[k] = right[j];
			j++;
			k++;
		}
		
		
	}
	
	static void print(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		int array[] = {10,3,4,2,5};
		System.out.println("original array :");
		print(array);
		System.out.println(" ");
		mergeSortUsingRecursion(array);
		System.out.println("sorted array : ");
		print( array);
		
		
		 
		
	}
}

