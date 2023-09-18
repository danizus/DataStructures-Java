
import java.util.*;


// linearSearch 
public class linearSearch{
	
public static	void  LinearSearch(int array[],int n){
				boolean found = false;
				for(int i=0;i<array.length;i++){
					if(array[i]==n) {
						found = true;
						int index = i;
						System.out.println("found at index: "+ index);
                        return;
					}
					
					
				}

					System.out.println("not found");
			
				
	
		 
	 }
	
	
	public static void main(String[] args) {
		
		int[] array = {-20,0,8,10,3,12,2,1,18,10,-1,5};
		LinearSearch(array,-20);
		 
		
	}
}

