

import java.util.Arrays;

public class Longest_Consecutive_sequence {

	public static void main(String[] args) {
		int []arr= {100,4,200,1,3,2};
		Arrays.sort(arr);
	 
		int longest=1;
		int count=1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]==arr[i-1]+1) {
				count++;
				
			}
			else if(arr[i]!=arr[i-1]) {
				count=1;
				
			}
			longest=Math.max(count, longest);
		}
		System.out.println(longest);

	}

}