
import java.util.*;


	public class mergeSort {
			
			
			
		static public void merge(int[] array,int s,int mid,int e){
			int merged[] = new  int[e-s+1];
			
			int idx1 = s;
			int idx2 = mid+1;
			int x=0;
			while(idx1<=mid && idx2 <=e) {
				if(array[idx1]<array[idx2]) {
					merged[x++] = array[idx1++];
				}else {
					merged[x++] = array[idx2++];
					
				}
				
			}
			while(idx1<=mid) {
				merged[x++] = array[idx1++];
			}
			while(idx2<=e) {
				merged[x++] = array[idx2++];
			}
			
			
			for(int i=0,j=s;i<merged.length;i++,j++) {
				array[j] = merged[i];
			}
		}
		
		  static public void divide(int[] array,int s,int e) {
			
			  if(s>=e) {
				  return;
				  
			  }
			  
			  int mid = s + (e-s)/2;
			  
			  
			  divide(array,s,mid);
			  divide(array,mid+1,e);
			  merge(array,s,mid,e);
			  
			  
			  
			  
		
			  
		  }
		  
		  public static void print(int[] array) {
			  for(int i = 0;i<array.length;i++) {
				  System.out.print(array[i]+" ");
			  }
		  }
		
	    public static void main(String[] args) {
	    
	    	int array[] = {2,1,0,6,5,7,0};
	    	divide(array,0,6);
	    	print(array);
	    
	    	
	    	
	    	
	    }

}

