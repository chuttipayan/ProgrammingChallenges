import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * This class is for finding the total time for a queue to get 
 * tickets at ticket counter .
 * Given Input is an array , each member in the array represents  the number of tickets they need
 * Only one ticket is issued per person which means the person goes back to the end of the queue.
 * Assume a ticket issue takes a unit of time seconds/minutes 
 * There is no time consumed while back to the end of the queue.
 * 
 * 
 * The output should be an array indicating the time taken by each individual 
 * 
 * 
 * @author Sunil Vikram
 *
 */


public class QueueTiming {
	
	  private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        
	        String queueLength = scanner.nextLine();

	        int n = Integer.parseInt(queueLength);
	        
	        int[] ar = new int[n];
	        String[] arItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        for (int i = 0; i < n; i++) {
	            int arItem = Integer.parseInt(arItems[i]);
	            ar[i] = arItem;
	        }

	        int timeArry[] = queueTime(n,ar);
	        printArray("FinalResult", timeArry);
	        scanner.close();
	    }

		private static int[] queueTime(int n, int[] ar) {
			// TODO Auto-generated method stub
			int totaltime=0;
			int[] result= new int[n];
	        
			for (int i = 0; i < ar.length; i++) {
				totaltime +=ar[i];
			}
			
			int j=0;
			int k =j%n;
			while(j<totaltime)
			{
				
				if(k >= n)
					k= j%n;
				if(ar[k]!=0)
				{	
					ar[k]--;
					j++;
					if(ar[k]==0)
						result[k]=j;
					k=k+1;
					int i = 0;
					
					while(i<n)
					{
						if(ar[i]!=0)
						{
							result[i]=j;
						}
						i++;
					}
				}
				else
				{
					k=k+1;
				}
				

			}
			
			return result;
		}
		
		public  int[] queueTime(int[] ar) {
			// TODO Auto-generated method stub
		
			int result []= queueTime(ar.length, ar);
			return result;
		}


		private static void printArray(String string, int[] ar) {
			// TODO Auto-generated method stub
			for (int i = 0; i < ar.length; i++) {
				System.out.print(ar[i]+",");
			}
			System.out.println();
		}
	
	
	
	

}
