package stringlists;

import java.util.Arrays;

import string_ir.String;

/**
 * Each instance of this class stores a list of strings.
 */
public class StringList {
	
	/**
	 * @invar | elements != null
	 * @invar | Arrays.stream(elements).allMatch(e -> e != null)
	 */
	private String[] elements;
	
	/**
	 * @basic
	 * @post | result != null
	 * @post | Arrays.stream(result).allMatch(e -> e != null)   // forall e in result. e != null
	 */
	public String[] getElements() {
		return elements.clone();
	}
	
	public String getConcatenation() {
		String result = String.valueOf(new char[] {});
		for (String element : getElements()) {
			result = result.concat(element);
		}
		return result;
	}
	
	/**
	 * Initializes this object so that it stores the empty list of strings.
	 * 
	 * @post
	 *     | getElements().length == 0
	 */
	public StringList() { elements = new String[0]; }
	
	/**
	 * @pre The given element is not null
	 *    | element != null
	 * @post | getElements().length == old(getElements().length) + 1
	 * @post | Arrays.equals(getElements(), 0, old(getElements().length), old(getElements()), 0, old(getElements().length))
	 * @post | getElements()[old(getElements().length)] == element
	 */
	public void add(String element) {
		String[] newElements = new String[elements.length + 1];
		System.arraycopy(elements, 0, newElements, 0, elements.length);
		newElements[elements.length] = element;
		elements = newElements;
	}

}
