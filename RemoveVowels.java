package com.MindtreeCode.functional;

/*  wap       : Remove vowels from string
 *  input     : "Rakesh arekieosu"
 *  output    :  Rksh rks
 * 
 */

public class RemoveVowels {

	private static String vowels(String str)
	{
		String result="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='A' ||
					str.charAt(i)=='e' || str.charAt(i)=='E' ||
					str.charAt(i)=='i' || str.charAt(i)=='I' ||
					str.charAt(i)=='o' || str.charAt(i)=='O' ||
					str.charAt(i)=='u' || str.charAt(i)=='U' ) 
				continue;
			else
				result=result+str.charAt(i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		String str="Rakesh arekieosu";
		String result=vowels(str);
		System.out.println(result);
		
	}

}
