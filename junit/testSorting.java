import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


//@RunWith(Parameterized.class)
public class testSorting {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp()
	{
		
	}
	
		@SuppressWarnings("static-access")
		@Test
	public void test() throws Exception
	{
		Sorting st = new Sorting();
		int[] a = {3,1,2};
		st.insertionSort(a);
		st.quicksort(a);
		assertEquals(true,st.isSorted(a));
		int[] b = {2,1};
		assertEquals(false,st.isSorted(b));
		int[] c = {1,2,3,4,5,8,9,0,34,56,67,89};
		int[] d = {45,2,3,4,5,8,9,7,89,7,8,1};
		st.quicksort(d);
		st.quicksort(c);
		assertEquals(true,st.isSorted(c));
		Object[] e = {1,2,3,4};
		st.swapReferences(e, 0, 2);
		
	}
	
	/*@Test
	public void testIsTrisngle() throws Exception
	{
		
				assertEquals(this.expected,tr.isTriangle(tr));

	}*/
}


