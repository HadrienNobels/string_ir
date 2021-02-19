package string_ir;

/**
 * Each instance of this class represents a sequence of text characters.
 * 
 * @immutable
 */
public class String {
	
	/**
	 * @basic
	 * 
	 * @inspects | this
	 */
	public char[] toCharArray() { throw new RuntimeException("Not yet implemented"); }
	
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
	
	public static String valueOf(char[] characters) {
		throw new RuntimeException("Not yet implemented");
	}
}
