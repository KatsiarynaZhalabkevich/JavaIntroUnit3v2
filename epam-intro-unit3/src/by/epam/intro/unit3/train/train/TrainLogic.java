package by.epam.intro.unit3.train;

public class TrainLogic {

	public Train infoByNum(Train tr, int num) {

		if (tr.getNumber() == num) {
			return tr;

		} else
			return null;
	}

}
