package junitmaven;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JunitTest {
	
	@Test
	
	public void ejemploTest() {
		
		int a = 1;
		int b = 2;
		
		assertTrue(a + b == 3);
		
	}

}
