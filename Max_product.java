package com.chitkara;

public class Max_product {

	public static void main(String[] args) {
		int arr[]= {2,3,-2,4};
		int maxProduct=arr[0];
		int []max=new int[arr.length];
		max[0]=arr[0];
		for(int i=1; i<arr.length; i++) {
			max[i]=max[i-1]*arr[i];
			
			
		}
		for(int i=0; i<max.length; i++) {
			if(max[i]>maxProduct) {
				maxProduct=max[i];
			}
		}
		System.out.println(maxProduct);
		

	}

}
