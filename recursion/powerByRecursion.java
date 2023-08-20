import java.util.*;


// taking out the power using recursion
public class powerByRecursion {
	
	public static int powerUsingRecursion(int number,int power){
		//base case
		if(power == 0) {
			return 1;
			
		}
		if(power == 1) {
			return number;
		}
	
		// recursive case
		int answer = powerUsingRecursion(number,power/2);
		
		// if the power is even
		if(power%2==0) {
			return answer * answer; 
		}
		// if the power is odd
		else {
			return number*(answer*answer);
		}
		
		
		
		
		}
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		System.out.print("enter number : ");
		int number = input.nextInt();
		System.out.print("enter power : ");
		int power = input.nextInt();
		
		System.out.println("the answer is :"+powerUsingRecursion(number,power));  

		
	}
}

