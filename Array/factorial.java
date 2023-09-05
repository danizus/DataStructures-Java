
import java.util.*;



public class factorial {
	

   static public int factorial(int n) {
	   
	   int answer=1;
	   
	   for(int i = 0;i<n;i++) {
		 if(n==0 || n==1) {
			 return 1;
		   
	  
	   }else {
		   answer = answer *(n-i);
		   
	   }
	   }
	   return answer;
   }
	  
   

	public static void main(String[] args) {
		
		
		System.out.println(factorial(3));
		
		
		 
		
	}
}

