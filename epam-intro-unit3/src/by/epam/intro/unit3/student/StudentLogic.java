package by.epam.intro.unit3.student;

public class StudentLogic {
	
	//т.к. мы работаем с каждым студентом отдельно, то список студентов не создается.
	//если бы надо было подсчитать кол-во хороших / плохих, средний бал группы и тд, то нужен был бы список

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
