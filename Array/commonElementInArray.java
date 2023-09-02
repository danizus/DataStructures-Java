
import java.util.*;



public class commonElementInArray {
	

   static public ArrayList<Integer> intersection(int arr[],int arr1[]) {
	   
	   ArrayList <Integer> list  = new ArrayList <>();
	   for(int i = 0;i<arr.length;i++) {
		   for(int j = 0; j<arr1.length;j++) {
			   if(arr[i] == arr1[j]) {
				   list.add(arr[i]);
			   }
		   }
		   
	   }
	   return list;
	
	   
    	
    
   }
	
	static void print(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,5};
		int[] arr1 = {0,2,5};
	System.out.println((intersection(arr,arr1)));	
		
		
		 
		
	}
}

