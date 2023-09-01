
import java.util.*;



public class reversingArray{
	
public static	int[]  reverseArray(int array[]){
			int j  = array.length-1;
			int i = 0;
			
			while(i<=j) {
				int temp = array[i];
				array[i]= array[j];
				array[j] = temp;
				j--;
				i++;
				
				
			}
	
		 return array;
	 }
	
	
	static void print(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		int[] array = {1,2,3};
		print(reverseArray(array));
		
		
		 
		
	}
}

