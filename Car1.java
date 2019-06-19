
public class Car1 {
	String model;
	String manufacturer;
	String color;
	double mileage;
	double fuelTankCapacity;
	double currentSpeed;
	double currentFuelLevel;
	String currentDirection;
	double odometer;
	StringBuilder travelLog;
	
	Car1 (String model, String manufacturer, String color, double mileage, double fuelTankCapacity) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.color = color;
		this.mileage = mileage;
		this.fuelTankCapacity = fuelTankCapacity;
		this.currentSpeed = 0.0;
		this.currentFuelLevel = 1.0;
		this.currentDirection = "NORTH";
		this.odometer = 0.0;
		this.travelLog = new StringBuilder();
		
	}
	
	
	void drive (double drivingSpeed, String drivingDirection, double distanceTraveled) {
		currentSpeed = drivingSpeed;
		currentDirection = drivingDirection;
		double gasCurrent = fuelTankCapacity * currentFuelLevel;
		double gasConsumed = distanceTraveled / mileage;
		gasCurrent = gasCurrent - gasConsumed;
		currentFuelLevel = gasCurrent / fuelTankCapacity;
		this.odometer = this.odometer + distanceTraveled;
	}
	
	String getModel () {
		return model;
		
	}
	
	boolean checkFull () {
		if (currentFuelLevel == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void park () {
		this.currentSpeed = 0.0;
		System.out.println("The car has been parked");
	}
	
	void turn (String turnDirection) {
		if (turnDirection.toUpperCase().equals("RIGHT")) {
			if (currentDirection.contentEquals("NORTH")) {
				currentDirection = "EAST";
			}
			else if (currentDirection.contentEquals("EAST")) {
				currentDirection = "SOUTH";
			}
			else if (currentDirection.contentEquals("SOUTH")) {
				currentDirection = "WEST";
			}
			else if (currentDirection.contentEquals("WEST")) {
				currentDirection = "NORTH";
			}
	}
		else if (turnDirection.toUpperCase().equals("LEFT")) {
			if (currentDirection.contentEquals("NORTH")) {
				currentDirection = "WEST";
			}
			else if (currentDirection.contentEquals("EAST")) {
				currentDirection = "NORTH";
			}
			else if (currentDirection.contentEquals("SOUTH")) {
				currentDirection = "EAST";
			}
			else if (currentDirection.contentEquals("WEST")) {
				currentDirection = "SOUTH";
			}
		}
	}
	
	void refuel () {
		park ();
		this.currentFuelLevel = 1.0;
		System.out.println("The car has been refueled");
	}
	
	public static void main(String[] args) {
		/*
		Car1 myCar = new Car1();
		myCar.manufacturer = "Smart";
		myCar.model = "ForTwo";
		myCar.color = "Gray";
		myCar.mileage = 35;
		myCar.fuelTankCapacity = 10;
		System.out.println(myCar.getModel());
		myCar.currentFuelLevel = 1;
		myCar.drive(50, "West", 20);
		System.out.println(myCar.getCurrentSpeed());
		System.out.println(myCar.getCurrentFuelLevel());
		*/

		Car1 myCar = new Car1("Accord", "Honda", "Magenta", 35, 1000000);
		System.out.println(myCar.model);
		myCar.drive(50, "WEST", 20);
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getColor() {
		return color;
	}

	public double getMileage() {
		return mileage;
	}

	public double getFuelTankCapacity() {
		return fuelTankCapacity;
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public double getCurrentFuelLevel() {
		return currentFuelLevel;
	}

	public String getCurrentDirection() {
		return currentDirection;
	}
	

}
