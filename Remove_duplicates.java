package com.chitkara;

import java.util.HashSet;
import java.util.Set;

public class Remove_duplicates {

	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3};
		Set<Integer>set=new HashSet<>();
		for(int num: arr) {
			set.add(num);
		}
		System.out.println(set.size());
		

	}

}
