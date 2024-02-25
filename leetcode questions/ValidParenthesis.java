
import java.util.*;

	

	
	public class ValidParenthesis {
	
	      public boolean isValid(String s) {
	    	   Stack<Character> stack  = new Stack<Character>();
	    	   for (char c : s.toCharArray()) {
	    		   if(c =='(') {
	    			   stack.push(')');
	    	
	    		   }else if(c =='[') {
	    			   stack.push(']');
	    	
	    		   }else if(c =='{') {
	    		   stack.push('}');
	    		
	    	   }else if(stack.empty() || stack.pop() != c ) {
	    		   return false;
	    	   }
	    		   
	    	   }
	    	   return stack.empty();	  
	      }      
		    
		 public static void main(String[] args){
	        ValidParenthesis objectName = new ValidParenthesis();
	        String s = "{()[]{}}";
	       System.out.println((objectName.isValid(s)));
	    }
	}
	   
	    