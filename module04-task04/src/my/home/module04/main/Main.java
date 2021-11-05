package my.home.module04.main;




import java.util.Arrays;

import my.home.module04.entity.Depot;
import my.home.module04.entity.Time;
import my.home.module04.entity.Train;
import my.home.module04.logic.TrainLogic;
import my.home.module04.view.View;

/*Создайте класс Train содержащий следующие поля:название пункта назначения,номер поезда, 
* время отправления.
* Создайте данные в  массив из пяти элементов типа Train,
*  добавьте возможность сортировки элементов массива по номерам поездов.
*  Добавьте возможность вывода информации о поезде, номер которого введён пользователем.
*  Добавьте возможность сортировки массив по пункту назначенич, 
*  причём поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
* */
public class Main {

	public static void main(String[] args) {

	

		Depot depot = new Depot();
		
		
		depot.addTrain(new Train("Poznan",78,new Time(15,35)));
		
		depot.addTrain(new Train("London",65,new Time(13,40)));
		
		depot.addTrain(new Train("Amsterdam",15,new Time(9,35)));
		
		depot.addTrain(new Train("London",10,new Time(22,45)));
		
		depot.addTrain(new Train("Amsterdam",94,new Time(23,10)));
		
		

		Train[] listOfTrains = depot.getTrains();

		View view = new View();

		view.print("Список поездов", listOfTrains);

		TrainLogic trainLogic = new TrainLogic();

		view.print("Сортировать поезда по номеру: ");

		trainLogic.sortByTrainNumber(listOfTrains);

		view.print(Arrays.toString(listOfTrains));

		Train result = trainLogic.findByNumber(listOfTrains);
		
		view.print(result);

		view.print("Сортировать поезда по направлению и времени");

		trainLogic.sortByDestination(listOfTrains);
		trainLogic.sortByDepartureTime(listOfTrains);

		view.print(listOfTrains);

	}

}
