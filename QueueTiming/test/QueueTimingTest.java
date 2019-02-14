import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
public class QueueTimingTest {

	@Test
	public void testSimpleTestCase() {
		
		QueueTiming qt = new QueueTiming();
		
		int result[]=qt.queueTime(new int[] {1,1,1});
		
		assertArrayEquals(new int[] {1,2,3}, result);
		
		
	}
	
	@Test
	public void testSimpleTestCase1() {
		
		QueueTiming qt = new QueueTiming();
		
		int result[]=qt.queueTime(new int[] {1,2,3,4});
		assertArrayEquals(new int[] {1,5,9,10}, result);
		
		
	}

}
