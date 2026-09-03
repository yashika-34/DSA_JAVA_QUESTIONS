

public class Largest {
	public static void main(String[] args) {
		int arr[]= {5,2,9,1,7};
		int smallest=arr[0];
		int largest=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
		
		
	}

}