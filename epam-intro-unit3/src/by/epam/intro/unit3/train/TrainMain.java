package by.epam.intro.unit3.train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrainMain {
	public static void main(String[] args) throws IOException {
		
		TrainLogic trainLogic = new TrainLogic();

		Train[] tr = new Train[5];
		tr[0] = new Train("Minsk");
		tr[1] = new Train("Gomel");
		tr[2] = new Train("Brest"); // все остальные данные генерируются в конструкторе
		tr[3] = new Train("Minsk");
		tr[4] = new Train("Vitebsk");

		System.out.println("------------Train's information------------");
		
		for (int i = 0; i < tr.length; i++) {
			System.out.println(tr[i]);
		}

		System.out.println("--------------- Sort by numbers -------------");
		
		trainLogic.sortByNum(tr);
		for (int i = 0; i < tr.length; i++) {
			System.out.println(tr[i]);
		}
		
		
		 System.out.println("--------------- Sort by destination -------------");
		
		 trainLogic.sortByDestination(tr); 
		  for (int i = 0; i <tr.length; i++) {
			  System.out.println(tr[i]);
		  }
		

		System.out.println("Insert train's number to get the information --> ");
		// чтение значений с клавиатуры
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int num = Integer.parseInt(str);

		if (trainLogic.infoByNum(tr, num) != null) {
			System.out.println(trainLogic.infoByNum(tr, num));
		} else {
			System.out.println("Train doesn't exist!");
		}

	}
}
