/*
 *      Enter A Value : 
		11
		Prime Numbers up to 11
		2 3 5 7 11 
 */


package com.MindtreeCode.functional;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class PrintPrime {

	public static void main(String[] args)  throws IOException{
		
		int n, count, c = 0;
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A Value : ");
        n = Integer.parseInt(br.readLine());
        System.out.println("Prime Numbers up to " + n);
        
        for (int i = 2; i <= n; i++) {
            count = 2;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2) {
                System.out.print(i + " ");
                c++;
            }
        }

	}

}
