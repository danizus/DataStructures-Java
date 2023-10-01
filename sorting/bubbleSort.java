
import java.util.*;

	
// bubblesort!!.
	
	public class bubbleSort {
		
		
		  static public void bubbleSort(int[] array) {
			  int n = array.length;
			  for(int i = 1;i<n;i++) {
				  
				 for(int j=0;j<n-i;j++) {
					 if(array[j]>array[j+1]) {
						 int temp = array[j];
						  array[j] = array[j+1];
						  array[j+1] = temp;
						 
						 
						 
					 }
				 }
			  }
			
			  
			  
			  
			  
			  
		  }
		  
		  public static void print(int[] array) {
			  for(int i = 0;i<array.length;i++) {
				  System.out.print(array[i]+" ");
			  }
		  }
		
	    public static void main(String[] args) {
	    
	    	int array[] = {2,1,0,6,5,3,0};
	    	bubbleSort(array);
	    	print(array);
	    	
	    	
	    	
	    }

}

