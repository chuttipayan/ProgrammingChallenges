package com.sunil.prgchallenges.cutsticks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
    	//int [] result = new int[];
    	Arrays.sort(arr);
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i =0; i < arr.length;i++)
    	{
    		int temp=arr[i];
    		
    		if(arr[i]!=0)
    		{
    			int count=0;
    			for (int j = i; j < arr.length; j++) {
    					arr[j]=arr[j]-temp;
    					count++;
    				
    			}
    			list.add(count);
    			
    		}
    		
    	}
    	//System.out.println(list);
    	return list.stream().mapToInt(i -> i).toArray();
    	
    	
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
    
            if (i != result.length - 1) {
            }
        }

            scanner.close();
    }
}
