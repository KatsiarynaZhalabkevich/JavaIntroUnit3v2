package by.epam.intro.unit3.student;

import java.util.Arrays;
import java.util.Random;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
 * Создайте массив из десяти элементов такого типа.
 * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class Student {

	private String name;
	private int groupNum;
	private int[] marks = new int[5];

	Random random = new Random();

//логический блок инициализации отметок
//т.к. в констукторе метод вызывать нежелательно, а в ручную вводить долго
	{
		for (int i = 0; i < 5; i++) {

			while (marks[i] < 4 || marks[i] > 10) {

				marks[i] = 8 + random.nextInt(11);
			}
		}
	}

//конструктор с 1 параметром
	public Student(String name) {

		this.name = name;
		this.groupNum = 100 + random.nextInt(10);

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setGroupNum(int groupNum) {
		this.groupNum = groupNum;
	}

	public int getGroupNum() {
		return groupNum;
	}

	public void setMarks(int[] mas) {

		if (mas.length == marks.length) {
			marks = mas;
		}

	}

	public int[] getMarks() {
		return marks;
	}

	public void setOneMark(int index, int mark) {
		if (index >= 0 && index < marks.length) {
			marks[index] = mark;
		}
	}

	public int getOneMark(int index) {
		if (index >= 0 && index < marks.length) {
			return marks[index];
		} else
			return -1;
	}

	@Override
	public String toString() {
		return "Student's information:\n name: " + getName() + ", group " + getGroupNum() + ",\n marks "
				+ Arrays.toString(getMarks()) + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + groupNum;
		result = prime * result + Arrays.hashCode(marks);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (groupNum != other.groupNum)
			return false;
		if (!Arrays.equals(marks, other.marks))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}
