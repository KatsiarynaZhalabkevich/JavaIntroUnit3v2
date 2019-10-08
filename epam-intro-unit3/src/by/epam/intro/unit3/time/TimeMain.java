package by.epam.intro.unit3.time;

public class TimeMain {
	public static void main(String[] args) {

		Time time = new Time();
		time.setHour(5);
		time.setMinute(25);
		time.setSecond(59);

		System.out.println(time);
		time.setHour(-3);
		time.setMinute(5);
		System.out.println(time);
		time.setSecond(13);
		System.out.println(time);

	}
}
