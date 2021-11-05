package my.home.module04.entity;

import java.util.Arrays;

public class Depot {

	private Train[] trains;
	private static final int DEPOT_CAPACITY = 5;
	private int realDepotCapacity;

	public Depot() {
		trains = new Train[DEPOT_CAPACITY];
		realDepotCapacity = 0;
	}

	public Train[] getTrains() {
		return trains;

	}

	public Train getTrain(int index) {
		return trains[index];
	}

	public void setTrains(Train[] trains) {
		this.trains = trains;
	}

	public boolean addTrain(Train train) {
		if (realDepotCapacity == DEPOT_CAPACITY) {
			return false;
		} else {
			trains[realDepotCapacity] = train;
			realDepotCapacity++;
			return true;
		}

	}

	@Override

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trains == null) ? 0 : Arrays.hashCode(trains));
		return result;

	}

	@Override

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;

		Depot other = (Depot) o;
		if (trains == null) {
			if (other.trains != null)
				return false;
		} else if (!Arrays.equals(trains, other.trains))
			return false;

		return true;

	}

	@Override

	public String toString() {
		return getClass().getSimpleName() + " [ trains = " + trains + " ]";
	}

}
