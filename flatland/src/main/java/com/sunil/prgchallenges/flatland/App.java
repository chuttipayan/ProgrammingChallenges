package com.sunil.prgchallenges.flatland;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class App {

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
    	
    	int max=0;
    	int midpoint =0;
    	Arrays.sort(c);
    	for (int i = 0; i < c.length; i++) {
    		// find mid point 
    		
    		if(c[i]+1 <n)
    		{
    			
    			midpoint =(c[i+1]-c[i])/2;
    			System.out.println(midpoint);
    			
    			if (midpoint > max)
    				max= midpoint;
    					
    		}
    		else
    			break;
		}
    	System.out.println(c[c.length-1]);
    	if(n > c[c.length-1])
    	{
    		midpoint = (n- c[c.length-1])/2;
    		midpoint = midpoint * 2;
    		if (midpoint > max)
        				max= midpoint;
        					
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