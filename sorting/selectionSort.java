
import java.util.*;


	
// Selection sort!
	
	public class selectionSort {
		
		
		  static public void selectionSort(int[] array) {
			  int n = array.length;
			  for(int i = 0;i<n-1;i++) {
				  int minIndex = i;
				  for(int j=i+1;j<n;j++) {
					  if(array[j] < array[minIndex]) {
						  minIndex = j;
					  }
					  
				  }
				  int temp = array[minIndex];
				  array[minIndex] = array[i];
				  array[i] = temp;
				  
			  }
			  
			  
			  
			  
			  
		  }
		  
		  public static void print(int[] array) {
			  for(int i = 0;i<array.length;i++) {
				  System.out.print(array[i]+" ");
			  }
		  }
		
	    public static void main(String[] args) {
	    
	    	int array[] = {2,1,0,6,5};
	    	selectionSort(array);
	    	print(array);
	    	
	    	
	    	
	    }

}