package string_ir.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void test() {
		String hello = String.valueOf(new char[] {'h', 'e', 'l', 'l', 'o'});
		assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, hello.toCharArray());
		assertEquals(5, hello.length());
		assertEquals('h', hello.charAt(0));
	}

}
