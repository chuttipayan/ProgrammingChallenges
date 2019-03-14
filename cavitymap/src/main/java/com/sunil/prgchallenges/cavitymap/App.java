package com.sunil.prgchallenges.cavitymap;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class App {

    // Complete the cavityMap function below.
    static String[] cavityMap(String[] grid) {
    	
    	String result[] = new String[grid.length];
    	result[0]=grid[0];
    	result[grid.length-1]=grid[grid.length-1];
    	for(int i =1; i <= grid.length-2;i++)
    	{
    		String temp= grid[i];
    		int j=0;
    		StringBuffer temp1=new StringBuffer("");
    		while(j<temp.length())
    		{
    			
    			if(j==0 ||j==temp.length()-1)
    			{
    				temp1.append(temp.charAt(j));
    			}
    			else 
    			{
    				int num= temp.charAt(j)-48;
    				if(num > grid[i-1].charAt(j)-48  && num > temp.charAt(j-1)-48 && num > temp.charAt(j+1)-48 && num > grid[i+1].charAt(j)-48)
    				{
    					temp1.append("X");
    				}
    				else
    				{
    					temp1.append(temp.charAt(j));
    				}
    			}
    				
    			j++;
    		}
    		result[i]=temp1.toString();
    	}
    	return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

            if (i != result.length - 1) {
                System.out.println("\n");
            }
        }


        scanner.close();
    }
}
