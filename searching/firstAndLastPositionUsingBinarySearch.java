
import java.util.*;




public class firstAndLastPositionUsingBinarySearch {
	

	 public static int firstPosition(ArrayList<Integer> arr, int n, int k) {
		int start = 0;
		int end = n - 1;
		int answer = -1;
		int mid = start + (end - start)/2;
		
		while(start<=end) {
			if(arr.get(mid) == k) {
				answer = mid;
				end = mid-1;
			}
			else if(arr.get(mid)<k) {
				start = mid+1;
			}
			else {
				end = end-1;
			}
			mid = (end + start)/2;
		}
		return answer;
	        

	     
   }
	
	 public static int lastPosition(ArrayList<Integer> arr, int n, int k) {
		 int start = 0;
	        int end = n - 1;
	        int mid = start + (end - start)/2;
	        int answer = -1;
	        
	        
	        while(start <= end) {
	        	if(arr.get(mid) == k) {
	        		answer = mid;
	        		start = mid+1;
	        		mid = start + (end - start)/2;
	        		continue;
	        		
	        		
	        	}
	        	if(arr.get(mid) < k) {
	        		start = mid + 1;
	        	}
	        	else {
	        		end = mid - 1;
	        		
	        	}
	        	mid = start + (end - start)/2;
	        }
	      
	       
	     
	     
	       return answer;
	        

	     
   }
	
 

	public static void main(String[] args) {
		
		
	ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,2,3,3,3,4));
	
		ArrayList<Integer> result = new ArrayList<>();
		
		result.add(firstPosition(arr,6,3));
		
		result.add(lastPosition(arr,6,3));
		System.out.println(result);
		
	
		
		
		 
		
	}
}

