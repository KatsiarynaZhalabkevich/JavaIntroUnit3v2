package by.epam.intro.unit3.student;

public class StudentMain {

	public static void main(String[] args) {

		StudentLogic studentLogic = new StudentLogic();

		String[] names = { "Ivanov I.I.", "Petrov P.P.", "Novikov N.N.", "Brawn B.B.", "Smith S.M.", "Small P.D.",
				"Pitt B.T.", "Hud R.B.", "White P.N.", "Black J.L." };
		Student[] st = new Student[10];

		for (int i = 0; i < names.length; i++) {
			st[i] = new Student(names[i]);

		}
		for (int i = 0; i < names.length; i++) {

			System.out.println(st[i]);

		}

		System.out.println("Good students: ");
		int count = 0;
		for (int i = 0; i < st.length; i++) {

			if (studentLogic.isGoodStudent(st[i])) {
				System.out.println(st[i]);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Sorry, we don't have good students!");
		}

	}

}
