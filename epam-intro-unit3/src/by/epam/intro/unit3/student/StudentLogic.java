package by.epam.intro.unit3.student;

public class StudentLogic {

	public boolean isGoodStudent(Student st) {

		int count = 0;
		int[] mark = st.getMarks();

		for (int i = 0; i < 5; i++) {
			if (mark[i] >= 9) {
				count++;
			}
		}
		if (count == mark.length) {
			return true;
		} else
			return false;

	}

}
