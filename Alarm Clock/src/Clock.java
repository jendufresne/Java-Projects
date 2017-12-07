
public class Clock extends Machine {
	private String color;
	private String brand;
	private int hr = 12;
	private int min = 00;

	public Clock(String machineType, Boolean on, int hr, int min, String brand, String color) {
		super(machineType, on);
		setHr(hr);
		setMin(min);
		setBrand(brand);
		setColor(color);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setHr(int hr) {
		if (hr > 0 && hr <= 23) {
			this.hr = hr;
		} else {
			System.out.println("Error. Please enter an hour between 1 and 23. The current hour is " + getHr());
		}

	}

	public int getHr() {
		return hr;
	}

	public void setMin(int min) {
		if (min >= 0 && min <= 59) {
			this.min = min;
		} else {
			System.out.println("Error. Please enter a number from 0 to 59 for your minutes. The current minutes are " + getMin());
		}
	}

	public int getMin() {
		return min;
	}

	public String toString() {
		String result;
		result = super.toString() + " The clock is made by " + this.brand + ". " + "The color is " + this.color + ". "
				+ "The time is " + this.hr + ":" + this.min + ".";
		return result;
	}
}
