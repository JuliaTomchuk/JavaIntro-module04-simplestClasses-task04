package my.home.module04.entity;

public class Train {

	private String destination;
	private int trainNumber;
	private Time departureTime;

	public Train() {
		destination = "";
		trainNumber = 0;
		departureTime = new Time();
		;
	}

	public Train(String destination, int trainNumber, Time departureTime) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}

	public void setDestination(String destination) {
		this.destination = destination;

	}

	public String getDestination() {
		return destination;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setDepartureTime(Time depatureTime) {
		this.departureTime = depatureTime;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (trainNumber != other.trainNumber)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + trainNumber;
		return result;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[destination=" + destination + ", trainNumber=" + trainNumber
				+ ", departureTime=" + departureTime + "]";
	}

}
