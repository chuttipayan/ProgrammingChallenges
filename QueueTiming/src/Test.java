import java.util.ArrayList;
import java.util.Iterator; 
class Test 
{ 
    public static void main(String args[]) 
    { 
        // Creating an ArrayList with elements 
        // {1, 2, 3, 4} 
        ArrayList<Integer> arrL = new ArrayList<Integer>(); 
        arrL.add(1); 
        arrL.add(2); 
        arrL.add(3); 
        arrL.add(1); 
  
        
  
        // Using lambda expression to print even elements 
        // of arrL 
        arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); }); 
        
//        for (Iterator iterator = arrL.iterator(); iterator.hasNext();) {
//			Integer integer = (Integer) iterator.next();
//			if(integer%2==0)
//			{
//				System.out.println(integer);
//			}
//			else
//			{
//				System.out.println("odd");
//			}
//		}
    } 
} 