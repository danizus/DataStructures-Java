
import java.util.*;



public class sumOfArrayElements {
	
public static	int  sumOfAllElements(int array[]){
				int sum = 0;
				for(int i = 0;i<array.length;i++) {
					sum = sum+array[i];
					
					
				}
				return sum;
				
			}
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6};
		System.out.println(sumOfAllElements(array));
		
		
		 
		
	}
}

