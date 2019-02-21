package com.sunil.prgchallenges.strangecounter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *Bob has a strange counter. At the first second, it displays the number . Each second, the number displayed by the counter decrements by  until it reaches .

The counter counts down in cycles. In next second, the timer resets to  and continues counting down. The diagram below shows the counter values for each time  in the first three cycles:

https://s3.amazonaws.com/hr-challenge-images/22185/1469447349-bae87a5071-strange1.png

Find and print the value displayed by the counter at time .

Function Description

Complete the strangeCounter function in the editor below. It should return the integer value displayed by the counter at time .

strangeCounter has the following parameter(s):

t: an integer
Input Format

A single integer denoting the value of  t.
 *
 */
public class App 
{
	
	// Complete the strangeCounter function below.
    static long strangeCounter(long t) {
    	return 0;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = strangeCounter(t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
