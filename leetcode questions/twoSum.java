
import java.util.*;
	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.function.*;
	import java.util.regex.*;
	import java.util.stream.*;
	import static java.util.stream.Collectors.joining;
	import static java.util.stream.Collectors.toList;

	

	
	public class twoSum {
			
		public int[] twoSum(int[] nums, int target){
			int z=0;
	    	int[] result = new int[2];
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	            	if(nums[i]+nums[j] == target) {
	            		result[z++] = i;
	            		result[z++] = j;
	            	}
	            }
	        }
	return  result;
	    }

		 public static void main(String[] args){
	        int[] nums = new int[]{ 1,2,3};
	        twoSum objectName = new twoSum(); 

	        objectName.print(objectName.twoSum(nums,3));
	    }
	}
    
	   
	    