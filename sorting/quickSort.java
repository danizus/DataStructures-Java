
import java.util.*;


	public class quickSort {
			
			
			
		static public int partition(int[] array,int s,int e){
			int pivot = array[s];
			int count = 0;
			for(int i = s+1;i<array.length;i++) {
				if(array[i]<pivot) {
					count++;
				}
				
			}
			int pivotIndex = s+count;
			int temp1  = array[pivotIndex];
			array[pivotIndex] = array[s];
			array[s] = temp1;
			
			int i =0;
			int j = e;
			while(i<pivotIndex && j>pivotIndex) {
				while(array[i]<pivot) {
					i++;
				}
				while(array[j]>pivot) {
					j--;
				}
				
				int temp  = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			return pivotIndex;
			
		}


        
		
		  static public void quickSort(int[] array,int s,int e) {
			
			  if(s>=e) {
				  return;
				  
			  }
			  
			  int p = partition(array,s,e);
			  
			  
			  
			  quickSort(array,s,p-1);
			  quickSort(array,p+1,e);
		
		  }
		  
		  public static void print(int[] array) {
			  for(int i = 0;i<array.length;i++) {
				  System.out.print(array[i]+" ");
			  }
		  }
		
	    public static void main(String[] args) {
	    
	    	int array[] = {2,1,0,6,5,7,0};
	    	quickSort(array,0,6);
	    	print(array);
	    
	    	
	    	
	    	
	    }

}

