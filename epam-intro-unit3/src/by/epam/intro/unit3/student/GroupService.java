package by.epam.intro.unit3.student;

public class GroupService {

	private StudentLogic stL = new StudentLogic();

	public Student[] takeGoodStudents(Group group) {

		Student[] students = group.getStudents(); // массив студентов
		Student[] result = new Student[students.length]; // массив отличников
		
		int i = 0;
		
		for (Student student : students) {
			if (stL.isGoodStudent(student)) {
				result[i] = student;
				i++;
			}
		}
		return result;

	}

}
