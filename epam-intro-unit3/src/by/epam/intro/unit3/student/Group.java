package by.epam.intro.unit3.student;

public class Group {

	private Student[] students;
	private int groupSize = 0; // количество студентов в массиве

	public Group(int number) {
		students = new Student[number]; // выделяем память под массив

	}

	public boolean addStudent(Student student) { //проверка значений
		if (groupSize >= students.length)
			return false;

		students[groupSize] = student;
		groupSize++;
		return true;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public Student getStudentByIndex(int index) {
		if (index >= 0 && index < students.length) {
			return students[index];
		} else
			return students[0];
	}
}
