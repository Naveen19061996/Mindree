/*     1
	   3*2
	   4*5*6
	   10*9*8*7
	   11*12*13*14*15
 * 
 */

package com.MindtreeCode.functional;

public class Printpattern1 {
		  
	    // function to print the following pyramid 
	    // pattern 
	    static void printPattern(int n) 
	    { 
	        int j, k = 0; 
	  
	        // loop to decide the row number 
	        for (int i = 1; i <= n; i++) { 
	              
	            // if row number is odd 
	            if (i % 2 != 0) { 
	              
	                // print numbers with the '*'  
	                // sign in increasing order 
	                for (j = k + 1; j < k + i; j++) 
	                    System.out.print(j + "*"); 
	                System.out.println(j++); 
	  
	                // update value of 'k' 
	                k = j; 
	            } 
	  
	            // if row number is even 
	            else { 
	                 
	                // update value of 'k' 
	                k = k + i - 1; 
	  
	                // print numbers with the '*' in 
	                // decreasing order 
	                for (j = k; j > k - i + 1; j--) 
	                    System.out.print(j + "*"); 
	                System.out.println(j); 
	            } 
	        } 
	    } 
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int n=5;
			printPattern(n);
	}

}
