import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import stringlists.StringList;

import string_ir.String;

class StringListTest {

	@Test
	void test() {
		StringList myStringList = new StringList();
		assertArrayEquals(new String[] {}, myStringList.getElements());
		
		myStringList.add(String.valueOf(new char[] {'h', 'e', 'l', 'l', 'o'}));
		myStringList.add(String.valueOf(new char[] {'w', 'o', 'r', 'l', 'd', '!'}));
		
		String[] myStringListElements = myStringList.getElements();
		myStringListElements[0] = null;
		
		assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd', '!'}, myStringList.getConcatenation().toCharArray());
	}

}
