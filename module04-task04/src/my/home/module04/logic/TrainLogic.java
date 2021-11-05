package my.home.module04.logic;

import my.home.module04.entity.Train;
import my.home.module04.view.View;

public class TrainLogic {

	public void sortByTrainNumber(Train[] listOfTrains) {

		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;

			for (int i = 0; i < listOfTrains.length - 1; i++) {
				if (listOfTrains[i].getTrainNumber() > listOfTrains[i + 1].getTrainNumber()) {

					swap(i, i + 1, listOfTrains);
					isSorted = false;
				}
			}

		}

	}

	private void swap(int indexFirst, int indexSecond, Train[] listOfTrains) {

		Train temp = listOfTrains[indexFirst];

		listOfTrains[indexFirst] = listOfTrains[indexSecond];
		listOfTrains[indexSecond] = temp;
	}

	public Train findByNumber(Train[] listOfTrains) {

		View view = new View();
		Train result = new Train();

		int number = view.readfromConsole();

		for (int i = 0; i < listOfTrains.length; i++) {

			if (listOfTrains[i].getTrainNumber() == number) {

				result = listOfTrains[i];
				break;

			}

		}
		return result;

	}

	public void sortByDestination(Train[] listOfTrains) {

		for (int i = 0; i < listOfTrains.length; i++) {
			for (int j = i + 1; j < listOfTrains.length; j++) {
				if (getChar(listOfTrains, i, 0) > getChar(listOfTrains, j, 0)) {
					swap(i, j, listOfTrains);
				} else if (getChar(listOfTrains, i, 0) == getChar(listOfTrains, j, 0)) {
					int counter = getCounter(listOfTrains, i, j);
					if (counter < getMinimum(listOfTrains, i, j)
							&& getChar(listOfTrains, i, counter) > getChar(listOfTrains, j, counter)) {
						swap(i, j, listOfTrains);
					}
				}
			}
		}
	}

	private char getChar(Train[] trains, int trainNumber, int charPosition) {
		return trains[trainNumber].getDestination().toLowerCase().charAt(charPosition);
	}

	private int getMinimum(Train[] trains, int i, int j) {
		return Math.min(trains[i].getDestination().length(), trains[j].getDestination().length());
	}

	private int getCounter(Train[] trains, int i, int j) {
		int counter = 0;
		while (counter < getMinimum(trains, i, j) && getChar(trains, i, counter) == getChar(trains, j, counter)) {
			counter++;
		}
		return counter;
	}

	public void sortByDepartureTime(Train[] listOfTrains) {

		for (int i = 0; i < listOfTrains.length - 1; i++) {

			if (listOfTrains[i].getDestination().equals(listOfTrains[i + 1].getDestination())
					&& listOfTrains[i].getDepartureTime().getHour() > (listOfTrains[i + 1].getDepartureTime().getHour())
					|| listOfTrains[i].getDestination().equals(listOfTrains[i + 1].getDestination())
							&& listOfTrains[i].getDepartureTime().getHour() == listOfTrains[i + 1].getDepartureTime()
									.getHour()
							&& listOfTrains[i].getDepartureTime()
									.getMinute() > (listOfTrains[i + 1].getDepartureTime().getMinute())) {
				swap(i, i + 1, listOfTrains);
			}
		}
	}

}
