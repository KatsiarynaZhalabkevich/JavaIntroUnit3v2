package by.epam.intro.unit3.train;

public class TrainLogic {

	public void sortByNum(Train[] tr) {
		Train train;
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

	public Train infoByNum(Train[] tr, int num) {

		for (int i = 0; i < tr.length; i++) {
			if (tr[i].getNumber() == num) {
				return tr[i];

			}
		}
		return null;
	}

	public void sortByDestination(Train[] tr) {
		Train train;
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
}
