package string_ir.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import string_ir.String;

class StringTest {

	@Test
	void test() {
		char [] myChars = new char[] {'h', 'e', 'l', 'l', 'o'};
		
		String hello = String.valueOf(myChars);
		
		assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, hello.toCharArray());
		assertEquals(5, hello.length());
		assertEquals('h', hello.charAt(0));
		
		myChars[0] = 'b';
		
		//char[] helloChars = hello.toCharArray();
		//helloChars[0] = 'b';
		
		assertEquals('h', hello.charAt(0));
		
		
	}

}
