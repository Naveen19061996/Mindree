package com.MindtreeCode.functional;

//  wap      : find GCD of 'N' Numbers
//  input    : 2,4,6,8,12  
//  output   : 2


public class GcdofNumbers {

	static int gcd(int a, int b)
	{
		if(a==0)
			return b;
		return gcd(b % a, a);
	}
	static int findgcd(int arr[],int n)
	{
		int result=arr[0];
		for(int i=1;i<n;i++)
			result=gcd(arr[i],result);
		return result;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2,4,6,8,12};
		int n=arr.length;
		System.out.println(findgcd(arr,n));
	}

}
