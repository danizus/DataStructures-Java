



public class BinarySearchByRecursion {
	static void prnt(int arr[]) {
		for(int i=0;i<(arr.length);i++) {
			System.out.print(arr[i]);
			
		
		}
		}
	
	public static boolean binarySearch(int arr[],int s,int e,int key){
		int mid = (s+e)/2;
		
		if(arr[mid]== key) {
			return true;
		}
		if(s>e) {
			return false;
			
		}
		
		if(arr[mid]<key) {
			return binarySearch(arr,mid+1,e,key) ;
		}else {
			return binarySearch(arr,s,mid-1,key);
		}
		
		
		
	
	}
	public static void main(String[] args) {
		int key = 6;
		int[] arr= {1,2,3,4,5,20};
		int s = 0;
		int e = 5;
		
		
		if(binarySearch(arr,s,e,key)) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
		
	     
		
	}
}

