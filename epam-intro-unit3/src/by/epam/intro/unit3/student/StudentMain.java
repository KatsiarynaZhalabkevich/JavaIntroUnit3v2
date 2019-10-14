package by.epam.intro.unit3.student;

public class StudentMain {

	public static void main(String[] args) {

		int number = 10;
		Group group = new Group(number);
		GroupService grServ = new GroupService();

		String[] names = { "Ivanov I.I.", "Petrov P.P.", "Novikov N.N.", "Brawn B.B.", "Smith S.M.", "Small P.D.",
				"Pitt B.T.", "Hud R.B.", "White P.N.", "Black J.L." };

		for (int i = 0; i < number; i++) {
			group.addStudent(new Student(names[i])); // создали студентов и поместили в группу
		}

		Student[] students = group.getStudents();
		System.out.println("All student's information:");
		printInfo(students);

		Student[] goodStudents;
		goodStudents = grServ.takeGoodStudents(group);

		System.out.println("Good students: ");
		printInfo(goodStudents);

	}

	public static void printInfo(Student[] st) {
		for (Student student : st) {
			if (student != null)
				System.out.println(student);
		}
	}

}
