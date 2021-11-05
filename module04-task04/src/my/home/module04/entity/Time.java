package my.home.module04.entity;



public class Time {
	private int hour;
	private int minute;

	public Time() {
		hour = 0;
		minute = 0;

	}

	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	public void setHour(int hour) {
		if (hour > 23 || hour < 0) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
	}

	public int getHour() {
		return hour;
	}

	public void setMinute(int minute) {

		if (minute > 59 || minute < 0) {
			this.minute = 0;
		} else {
			this.minute = minute;
		}

	}

	public int getMinute() {
		return minute;
	}

	@Override

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + hour;
		result = result * prime + minute;
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
		Time other = (Time) o;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;

		return true;

	}

	@Override

	public String toString() {

		return getClass().getSimpleName() + " [ hour = " + hour + ", minute = " + minute + " ]";
	}

}


