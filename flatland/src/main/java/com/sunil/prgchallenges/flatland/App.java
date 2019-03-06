package com.sunil.prgchallenges.flatland;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


/**
 * 
 * https://www.hackerrank.com/challenges/flatland-space-stations/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * 
 *
 */
public class App {

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
    	
    	int max=0;
    	int midpoint =0;
    	Arrays.sort(c);
    	for (int i = 0; i < c.length; i++) {
    		// find mid point 
    		if(i==0)
    		{
    			max= c[i]-0;
    		}
    		if(i+1 <c.length)
    		{
    			
    			midpoint =(c[i+1]-c[i])/2;
    			
    			System.out.println(midpoint);
    			
    			if (midpoint > max)
    				max= midpoint;
    					
    		}
    		else
    		{
    			if(n-c[i]>max)
    				max=n-c[i]-1;
    		}
		}
    	
    	return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);
        
        System.out.println(result);
       

        scanner.close();
    }
}