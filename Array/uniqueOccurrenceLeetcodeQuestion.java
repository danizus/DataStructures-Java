
import java.util.*;

// leetcode question 
// https://leetcode.com/problems/unique-number-of-occurrences/description/
// array questions 

public class uniqueOccurrenceLeetcodeQuestion {
	

   static public boolean uniqueOccurrences(int arr[]) {
    	Arrays.sort(arr);
    	ArrayList <Integer> list = new ArrayList<>();
    	int count = 1;
    	int val = arr[0];
    		
    	for(int i=1;i<arr.length;i++) {
    		 
    		if(val == arr[i]) {
    			count =count +1;
    			
    		}else if(!list.contains(count)) {
    			list.add(count);
    			val = arr[i]; 
    			count = 1; 
    		}else {
    			return false;
    		}
    	}
        // checks if the last count is unique
    	if(list.contains(count)) {
    		return false;
    		
    	}else {
    		return true;
    	}
    }

	public static void main(String[] args) {
		// will return true because of unique occurrence
		int[] array = {1,1,2,3,3,3};
	System.out.println((uniqueOccurrences(array)));	
		
		
		 
		
	}
}

