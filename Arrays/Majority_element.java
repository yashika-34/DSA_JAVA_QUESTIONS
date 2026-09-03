
public class Majority_element {

	public static void main(String[] args) {
		int arr[]= {2,2,1,1,1,2,2};
		int n=arr.length;
	   for(int i=0; i<n; i++) {
		   int count=0;
		   for(int j=0; j<n; j++) {
			   if(arr[i]==arr[j]) {
				   count++;
			   }
		   }
		   if(count>n/2) {
			   System.out.println(arr[i]);
			   break;
		   }
			
		}

	}

}