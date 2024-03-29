package by.epam.intro.unit3.train;

import java.util.Random;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. +
 * Создайте данные в массив из пяти элементов типа Train,
 * добавьте возможность сортировки элементов массива по номерам поездов. +
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем.+
 * Добавьте возможность сортировки массива по пункту назначения,+ 
 * причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.*/

public class Train {

	private String destination;
	private int number;
	private int timeHours;
	private int timeMinutes;

	Random random = new Random();

	public Train(String destination) {

		this.destination = destination;
		number = random.nextInt(15) + 1000;
		timeHours = random.nextInt(24);
		timeMinutes = random.nextInt(60);
	}

	public String getDestination() {
		return destination;
	}

	public int getNumber() {
		return number;
	}

	public int getTimeHours() {
		return timeHours;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setTimeHours(int timeHours) {
		this.timeHours = timeHours;
	}

	public void setTimeMinutes(int timeMinutes) {
		this.timeMinutes = timeMinutes;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public int getTimeMinutes() {
		return timeMinutes;
	}

	@Override
	public String toString() {
		return "\nTrain information: \n destination " + getDestination() + ", number " + getNumber() + ", departure at "
				+ getTimeHours() + ":" + getTimeMinutes();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + number;
		result = prime * result + timeHours;
		result = prime * result + timeMinutes;
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
		Train other = (Train) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (number != other.number)
			return false;
		if (timeHours != other.timeHours)
			return false;
		if (timeMinutes != other.timeMinutes)
			return false;
		return true;
	}

}
