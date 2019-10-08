package by.epam.intro.unit3.time;

/*Составьте описание класса для представления времени.
 * Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда) 
 * с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей поле устанавливается в значение 0.
 * Создать методы изменения времени на заданное количество часов, минут и секунд.*/

class Time {
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		if (hour >= 0 && hour <= 24) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}

		if (minute >= 0 && minute <= 60) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}

		if (second >= 0 && second <= 60) {
			this.second = second;
		} else {
			this.second = 0;
		}

	}

	public Time() {

		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}

	public int getHour() {
		return hour;
	}

//изначально было по 2 метода для часов, минут и секунд (1-для инициализации, 2-для изменения)
	public void setHour(int hour) { // дни не рассматриваются!

		if ((this.hour + hour) > 24) {
			System.out.println("Invalid hour value");
			this.hour = 0;
		} else {
			this.hour += hour;
		}

	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {

		this.minute += minute;
		if ((this.minute) > 60) {
			System.out.println("Minutes value more then 60. Hours changed");
			setHour(this.minute / 60);
			this.minute %= 60;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second += second;
		if (this.second > 60) {
			System.out.println("Seconds value more then 60. Minutes changed");
			setMinute(this.second / 60);
			this.second %= 60;
		}
	}

	@Override
	public String toString() {
		return "Time is " + getHour() + " hours " + getMinute() + " minutes " + getSecond() + " seconds";
	}

}
