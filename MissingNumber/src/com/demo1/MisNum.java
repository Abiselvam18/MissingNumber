package com.demo1;

public class MisNum {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,5};
		int sum, n=5, arr=0;
		sum=(n*(n+1))/2;
	
		
		for (int i=0; i<a.length; i++) {
			arr=arr+a[i];
		}
		//finding the missing number
		
		int missingNumber=sum-arr;
		System.out.println("Missing number is="+missingNumber);

	}

}
