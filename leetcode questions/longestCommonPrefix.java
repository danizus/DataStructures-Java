
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

	

	
	public class longestCommonPrefix {
	
	    public String longestCommonPrefix(String[] strs) {
	    	StringBuilder ans = new StringBuilder();
	    	Arrays.sort(strs);
	    	String first  = strs[0];
	    	String last  = strs[strs.length-1];
	    	for(int i = 0;i<Math.min(first.length(), last.length()); i ++) {
	    		if(first.charAt(i) == last.charAt(i)) {
	    			
	    			ans.append(first.charAt(i));
	    		}
	    		
	    		
	    	}
	    	return ans.toString();
	    }
			
		
			 
		        
		    
		 public static void main(String[] args){
	        longestCommonPrefix objectName = new longestCommonPrefix();
	        String sts[] = {"hello","hell","hel"};
	       System.out.println((objectName.longestCommonPrefix(sts)));
	    }
	}
	   
	    