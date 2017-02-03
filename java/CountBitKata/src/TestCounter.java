import static org.junit.Assert.*;

import org.junit.Test;

public class TestCounter {

	@Test
	public void counter_1이없는경우() {
		assertEquals(0, Counter.count_1bit(0));
	}

	@Test
	public void counter_1이하나있는경우() {
		assertEquals(1, Counter.count_1bit(2));
	}
	
	@Test
	public void counter_1이두개있는경우() {
		assertEquals(2, Counter.count_1bit(3));
	}

	@Test
	public void counter_1이세개있는경우() {
		assertEquals(3, Counter.count_1bit(14));
	}
	
	@Test
	public void counter_큰수1이하나있는경우() {
		assertEquals(1, Counter.count_1bit(16));
	}	
}