package ch.fhnw.algd1.converters.binary;

public class BinConverter {
	public static String toString(int x) {
		String s = "";
		if (x < 0) {
			x += 128;
			s += 1;
		} else {
			s += 0;
		}

		for (int i = 6; i >= 0; i--) {
			s += (x >> i) & 1; // add the (i)th from right bit
		}

		return s;
	}

	public static int fromString(String text) {
		int result = 0;
		for (int i = 1; i < 8; i++) {
			if (text.charAt(i) == '1') {
				result += (1 << (7 - i));
			}
		}
		if (text.charAt(0) == '1') { 
			result -= 128;
		}
		return result;
	}
}