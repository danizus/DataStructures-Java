
import java.util.*;





	
	public class insertionSort {
		
		
		  static public void insertionSort(int[] array) {
		int	 n = array.length;
			  for(int i=1;i<n;i++) {
				  int temp = array[i];
				 int j = i-1;
				  while(j>=0) {
					  if(array[j]>temp) {
						  //shift right
						  array[j+1]=array[j];
						  
					  }else {
						  
						  break;
					  }
					  j--; 
				  }
				  array[j+1]=temp;
				  
			  }
			  
		  }
		  
		  public static void print(int[] array) {
			  for(int i = 0;i<array.length;i++) {
				  System.out.print(array[i]+" ");
			  }
		  }
		
	    public static void main(String[] args) {
	    
	    	int array[] = {2,1,0,6,5,7,0};
	    	insertionSort(array);
	    	print(array);
	    	
	    	
	    	
	    }

}

