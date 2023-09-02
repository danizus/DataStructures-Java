
import java.util.*;



public class findDuplicateLeetCodeQuestion {
	
   static public ArrayList<Integer> findDuplicate(int nums[]) {
	   
   
    Arrays.sort(nums);
    
    Set <Integer> seen =  new HashSet <>();
     
     int val = nums[0];
    for(int i=1;i<nums.length;i++) {
        
         if(val == nums[i]) {
            seen.add(val);
         }else{
            val = nums[i];
         }
        
         
     } 
     ArrayList <Integer> list = new ArrayList<>(seen);
     
     return list;
      
  }
	
	
	public static void main(String[] args) {
		
		int[] array = {1,2,2,3,3,2,1,6,6,6,6,6,6,8,5,5,1,1,9,1,9};
	System.out.println((findDuplicate(array)));	
		
		
		 
		
	}
}

