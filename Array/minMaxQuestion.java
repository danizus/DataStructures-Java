
import java.util.*;


// print minimum and maximum numbers in an array
public class minMaxQuestion {
	
public static	void  max_min(int array[]){
        int max = array[0];
        int min = array[0];
            for(int i= 0 ; i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
			}if(array[i]<min) {
				min = array[i];
			}
		}
		System.out.println("The greatest integer is : "+max+ "\n"+  "The smallest integer is : "+min);
		 
	 }

	
	
	public static void main(String[] args) {
		
		int[] array = {0,8,10,3,12,2,1};
	    max_min(array);
		 
		
	}
}

