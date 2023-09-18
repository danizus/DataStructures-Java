
import java.util.*;



public class fibonacci {
	

   static public int Fibonacci(int n) {
	  int fib[] = new int[n];
	  fib[0]=0;
	  fib[1]=1;
	  for(int i=2;i<n;i++) {
		  fib[i] = fib[i-1]+fib[i-2];
		  
	  }
	  
	  return fib[n-1];

	  
    
   }
	
	
	public static void main(String[] args) {
		
		
		System.out.println(Fibonacci(8));	 	
	}
}

