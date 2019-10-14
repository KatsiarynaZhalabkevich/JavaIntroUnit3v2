package by.epam.intro.unit3.train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrainMain {
	public static void main(String[] args) throws IOException {

		int number = 5;
		Depo depo = new Depo(number);

		DepoLogic depoLog = new DepoLogic();

		Train[] tr = new Train[number];
		tr[0] = new Train("Minsk");
		tr[1] = new Train("Gomel");
		tr[2] = new Train("Brest"); // все остальные данные генерируются в конструкторе
		tr[3] = new Train("Minsk");
		tr[4] = new Train("Vitebsk");

		for (int i = 0; i < tr.length; i++) {
			depo.addTrain(tr[i]);
		}

		System.out.println("------------Train's information------------");
		printInfo(depo.getTrains());

		System.out.println("--------------- Sort by numbers -------------");

		depoLog.sortByNum(depo);
		printInfo(depo.getTrains());

		System.out.println("--------------- Sort by destination -------------");

		depoLog.sortByDestination(depo);
		printInfo(depo.getTrains());

		System.out.println("Insert train's number to get the information --> ");
		// чтение значений с клавиатуры

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int num = Integer.parseInt(str);

		if (depoLog.takeTrainByNum(depo, num) != null) {
			System.out.println(depoLog.takeTrainByNum(depo, num));
		} else {
			System.out.println("Train doesn't exist!");
		}

	}

	public static void printInfo(Train[] trains) {
		for (Train tr : trains) {
			if (tr != null)
				System.out.println(tr);

		}
	}
}
