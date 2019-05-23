package com.sunil.prgchallenges.kaprekar;

import java.util.Scanner;


public class App 
{
	// Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(long p, long q) {
    	
    	String result ="";
    	while(p<=q)
    	{
    		
    		
    		String str= String.valueOf(p);
    		
    		String output=isKaprekar(p);
    		
    		if(!output.equals(""))
    			result=result+" "+output;
    		
    		int total=findTotal(str,0);
    		if(total==0)
    			p=p+1;
    		else if(total==1)
    			p=p+8;
    		else if(total >1 && total <9)
    			p= p+9-total;
    		else
    			p= p+1;
    		
    		
    	}
    	
    	if(result.equals(""))
    		System.out.println("INVALID RANGE");
    	else
    		System.out.println(result.trim());
    	
    }
    
    private static String isKaprekar(long num) {
    	
        long squared = (long) num * num;
        String str   = String.valueOf(squared);
        String left  = str.substring(0, str.length() / 2);
        String right = str.substring(str.length() / 2);
        int numL = (left.isEmpty())  ? 0 : Integer.parseInt(left);
        int numR = (right.isEmpty()) ? 0 : Integer.parseInt(right);
        if (numL + numR == num) {
            return num+"";
        } else {
            return "";
        }
    }
    
    static int findTotal(String number, int total )
    {
    	
    	if(number.length()==1)
    		return total;
    	total =0;
		for(int i =0; i < number.length();i++)
		{
			total+= Integer.parseInt(number.charAt(i)+"");
		}
		if(number.length()==1)
    		return total;
		else 
			return findTotal(String.valueOf(total),total);
    }
    
    
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long p = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long q = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }}
