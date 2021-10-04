package students.array;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	String name;
	ArrayList<Integer> marks = new ArrayList<Integer>();

	Student(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}

	}

	int numberOfMarks() {
		return marks.size();
	}

	int sumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		return sum;
	}

	int maxMarks() {

		return Collections.max(marks);
	}

	int minMarks() {
		return Collections.min(marks);
	}

	BigDecimal avgMarks() {
		return new BigDecimal(sumOfMarks()).divide(new BigDecimal(numberOfMarks()));
	}

}
