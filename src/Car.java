/**
 * 
 */

/**
 * @author Lenovo
 *
 */
public class Car extends Vehicle {
	private Integer numberOfDoors;

	 int getNumberOfDoors() {
		return numberOfDoors;
	}

	 void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	 void openTruck() {
		System.out.println("Truck Opened");
	}
}
