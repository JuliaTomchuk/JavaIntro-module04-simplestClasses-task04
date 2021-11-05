package my.home.module04.view;

import java.util.Arrays;
import java.util.Scanner;

import my.home.module04.entity.Train;

public class View {

	public void print(String message, Train[] trains) {

		System.out.println(message);
		System.out.println(Arrays.toString(trains));
	}

	public void print(String message) {

		System.out.println(message);

	}

	public void print(Train[] trains) {

		System.out.println(Arrays.toString(trains));
	}

	public void print(Train train) {

		System.out.println(train.toString());
	}
	
	public int readfromConsole() {

		@SuppressWarnings("resource")

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите номер поезда:");

		while (!scanner.hasNextInt()) {
			scanner.nextLine();
			System.out.println("Введите номер поезда:");
		}

		return scanner.nextInt();

	}

}
