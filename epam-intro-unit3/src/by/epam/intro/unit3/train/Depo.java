package by.epam.intro.unit3.train;

public class Depo {

	private Train[] trains;
	private int depoSize = 0;

	public Depo(int number) {
		trains = new Train[number];
	}

	public boolean addTrain(Train train) {
		if (depoSize >= trains.length)
			return false;
		else {
			trains[depoSize] = train;
			depoSize++;
			return true;

		}
	}

	public Train getTraiByIndex(int index) {
		if (index >= 0 && index < trains.length) {
			return trains[index];
		} else
			return trains[0];
	}

	public Train[] getTrains() {
		return trains;
	}

	public void setTrains(Train[] trains) {
		this.trains = trains;
	}

}
