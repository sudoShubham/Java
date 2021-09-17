package OOPS;

public class MyChar {
	char ch;

	MyChar(char ch) {
		this.ch = ch;
	}

	int isNumber() {
		int decimal = ch;
		if (decimal >= 48 && decimal <= 57) {
			return 1;
		} else
			return 0;
	}

	boolean isAlphabet() {
		int decimal = ch;
		if ((decimal >= 65 && decimal <= 90) || (decimal >= 97 && decimal <= 122)) {
			return true;
		}
		return false;
	}

	void printLower() {
		int res = ch + 32;

		System.out.println((char) res);
	}

	void printUpper() {
		int res = ch - 32;

		System.out.println((char) res);
	}

}
