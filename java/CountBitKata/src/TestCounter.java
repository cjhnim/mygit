import static org.junit.Assert.*;

import org.junit.Test;

public class TestCounter {

	@Test
	public void counter_1�̾��°��() {
		assertEquals(0, Counter.count_1bit(0));
	}

	@Test
	public void counter_1���ϳ��ִ°��() {
		assertEquals(1, Counter.count_1bit(2));
	}
	
	@Test
	public void counter_1�̵ΰ��ִ°��() {
		assertEquals(2, Counter.count_1bit(3));
	}

	@Test
	public void counter_1�̼����ִ°��() {
		assertEquals(3, Counter.count_1bit(14));
	}
	
	@Test
	public void counter_ū��1���ϳ��ִ°��() {
		assertEquals(1, Counter.count_1bit(16));
	}	
}