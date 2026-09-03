

public class Missing_number {

	public static void main(String[] args) {
		int arr[]= {3,0,1};
		int n=arr.length;
		int number = 0;
		for(int i=0; i<n; i++) {
			number=n^arr[i];
			
		}
		System.out.print(number);

	}

}
