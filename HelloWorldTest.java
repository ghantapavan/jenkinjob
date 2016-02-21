package google;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	HelloWorld newHello=new HelloWorld();
	
	@Test
	public void testAddNumber() {
		assertEquals(newHello.addNumber(2, 3), 5);
	}

	@Test
	public void testSubNumber() {
		assertEquals(newHello.subNumber(20, 3), 17);
	}

	@Test
	public void testMultiplyNumber() {
		assertEquals(newHello.multiplyNumber(2, 3), 6);
	}

}
