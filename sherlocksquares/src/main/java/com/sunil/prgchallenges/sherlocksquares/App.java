package com.sunil.prgchallenges.sherlocksquares;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * https://www.hackerrank.com/challenges/sherlock-and-squares/problem
 * @author chuttipayan
 *
 */

public class App {

    // Complete the squares function below.
    static int squares(int a, int b) {
    	int num=0;
        num=(int)(Math.floor(Math.sqrt(b)))-(int)(Math.ceil(Math.sqrt(a)))+1;
        return num;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = scanner.nextLine().split(" ");
            
            int a = Integer.parseInt(ab[0]);

            int b = Integer.parseInt(ab[1]);

            int result = squares(a, b);
            System.out.println(result);

        }

       
        scanner.close();
    }
}
