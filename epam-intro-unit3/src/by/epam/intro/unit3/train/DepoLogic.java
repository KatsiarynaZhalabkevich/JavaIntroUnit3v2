package by.epam.intro.unit3.train;

public class DepoLogic {

	TrainLogic trLog = new TrainLogic();

	public void sortByNum(Depo depo) {

		Train train; // для обмена
		Train[] tr = depo.getTrains();

		for (int j = 0; j < tr.length; j++) {
			for (int i = 0; i < tr.length - 1; i++) {

				if (tr[i].getNumber() > tr[i + 1].getNumber()) {
					train = tr[i];
					tr[i] = tr[i + 1]; // обмен
					tr[i + 1] = train;
				}

			}
		}
		
	}


	public void sortByDestination(Depo depo) {
		Train train;
		Train[] tr = depo.getTrains();
		for (int j = 0; j < tr.length; j++) {

			for (int i = 0; i < tr.length - 1; i++) {

				int a = tr[i].getDestination().compareTo(tr[i + 1].getDestination());
				if (a > 0) {

					train = tr[i];
					tr[i] = tr[i + 1];
					tr[i + 1] = train;
				}
			}
		}
		

	}

	public Train takeTrainByNum(Depo depo, int num) {

		Train[] trains = depo.getTrains();

		for (Train train : trains) {
			if (trLog.infoByNum(train, num) != null)
				return train;

		}
		return null;

	}

}
