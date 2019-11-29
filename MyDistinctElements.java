package com.MindtreeCode.functional;

// wap       : find Distinct elements from array
//input      : 10,10,15,20,20,30 
//output     : 10 15 20 30 

public class MyDistinctElements {

	public static void printDistinctElements(int arr[],int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			boolean isDintinct=false;
			for(int j=0;j<i;j++)
			{
				if(arr[i] == arr[j])
				{
					isDintinct=true;
					break;
				}
			}
			if(!isDintinct)
			{
				System.out.print(arr[i]+ " ");
				count++;
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr1[]= {10,10,15,20,20,30};
		int n=arr1.length;
		printDistinctElements(arr1,n);

	}

}
