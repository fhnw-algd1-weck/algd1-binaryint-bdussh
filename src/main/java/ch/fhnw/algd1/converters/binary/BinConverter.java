package ch.fhnw.algd1.converters.binary;

public class BinConverter {
	public static String toString(int x) {
		StringBuilder s = new StringBuilder(); // so a new String will not be created every time a character is appended.
		for (int i = 7; i >= 0; i--) {
			s.append(((x >> i) & 1) == 0 ? '0' : '1'); // add the (i)th from right bit
		}
		return s.toString();
	}

	public static int fromString(String text) {
		int result = 0;
		for (int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == '1') {
				result |= (1 << (text.length() - 1 - i));
			}
		}
		return (byte)result;
	}
}