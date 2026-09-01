package com.chitkara;

public class Second_Largest {

	public static void main(String[] args) {
		int arr[]= {10,5,8,10,3};
		int largest=arr[0];
		int  second_largest=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) {
				second_largest=largest;
				largest=arr[i];
			}
			else if(arr[i]>second_largest && arr[i]!=largest) {
				second_largest=arr[i];
			}
			
			
		}
		System.out.println(second_largest);

	}

}
