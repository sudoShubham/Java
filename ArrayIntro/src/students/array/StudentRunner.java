package students.array;

public class StudentRunner {
	public static void main(String[] args) {
		int saiMarks[] = { 1, 2, 3, 4 };
		Student sai = new Student("Sai", saiMarks);
		System.out.println(sai.avgMarks());
	}
}
