import static org.junit.Assert.*;

import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author francis
 *
 */
public class TestPrimeFactors {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	private List<Integer> list(int... ints) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i : ints)
			list.add(i);

		return list;
	}
	
	@Test
	public void testOne() throws Exception {

		assertEquals(list(), PrimeFactors.generate(1));
	}

	@Test
	public void testTwo() throws Exception {
		assertEquals(list(2), PrimeFactors.generate(2));
	}

	@Test
	public void testThree() throws Exception {
		assertEquals(list(3), PrimeFactors.generate(3));
	}
	
	@Test
	public void testFour() throws Exception {
		assertEquals(list(2,2), PrimeFactors.generate(4));
	}
	
	@Test
	public void testSix() throws Exception {
		assertEquals(list(2,3), PrimeFactors.generate(6));
	}	
	
	@Test
	public void testEight() throws Exception {
		assertEquals(list(2,2,2), PrimeFactors.generate(8));
	}	
	
	@Test
	public void testNine() throws Exception {
		assertEquals(list(3,3), PrimeFactors.generate(9));
	}		
}
