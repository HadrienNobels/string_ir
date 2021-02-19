package string_ir;

import java.util.Arrays;

/**
 * Each instance of this class represents a sequence of text characters.
 * 
 * @immutable
 */
public class String {
	
	/**
	 * @invar | characters != null
	 * 
	 * @representationObject
	 */
	private char[] characters;
	
	/**
	 * @basic
	 * 
	 * @inspects | this
	 */
	public char[] toCharArray() {
		return characters; // FOUT! Representation exposure!
	}
	
	/**
	 * @inspects | this
	 * 
	 * @post The result equals the number of characters in this string
	 *     | result == toCharArray().length
	 */
	public int length() {
		return toCharArray().length;
	}
	
	/**
	 * @inspects | this
	 * 
	 * @pre The index is within the bounds of the string
	 *    | 0 <= index && index < length()
	 * @post The result equals the character at the given index in this string
	 *    | result == toCharArray()[index]
	 */
	public char charAt(int index) {
		return toCharArray()[index];
	}
	
	private String(char[] characters) {
		this.characters = characters;
	}
	
	private static String EMPTY_STRING = new String(new char[] {});
	
	// factory method
	/**
	 * @inspects | characters
	 * 
	 * @pre The given array is not null
	 *    | characters != null
	 * @post The result is not null
	 *    | result != null
	 * @post This object's sequence of characters equals the sequence of characters in the given array
	 *    | Arrays.equals(result.toCharArray(), characters)
	 */
	public static String valueOf(char[] characters) {
		if (characters.length == 0)
			return EMPTY_STRING;
		else
			return new String(characters); // FOUT! Representation exposure!
	}
}
