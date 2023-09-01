
import java.util.*;



public class swapAlternateNumbers {
	
public static	int[]  swapAlternate(int array[]){
				for(int i = 0;i<array.length;i++) {
					if(i+1 < array.length){
						int temp = array[i];
						array[i] = array[i+1];
						array[i+1] = temp;
						
					}
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
		
		int[] array = {1,2,3,4,5,6};
		print(swapAlternate(array));
		
		
		 
		
	}
}

