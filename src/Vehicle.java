/**
 * 
 */

/**
 * @author Lenovo
 *
 */
public class Vehicle extends Engine implements Honkable  {
//	s: make, model, year, color, numberOfWheels, and weight. The class should have the following methods: start, stop, drive, and honk. The start method should print "Vehicle started." The stop method should print "Vehicle stopped." The drive method should take in a number of miles driven as a parameter and print "Vehicle driven X miles." The honk method should print "Honk Honk!"
//	Create a subclass of "Vehicle" called "Car" with the additional property of "numberOfDoors". The class should have an additional method called "openTrunk" that prints "Trunk opened."
//	Create another subclass of "Vehicle" called "Truck" with the additional property of "numberOfAxles" and "capacityInTons". The class should have an additional method called "load" that takes in a parameter for the weight of the load and prints "Loaded X tons."
//	Create instances of each class and demonstrate how polymorphism is achieved by calling the methods of the parent class on the child class objects.
//	NOTE: when you are done with this task notify us to share PART 2

	private Integer make;
	private String model;
	private Integer year;
	private String color;
	private Integer numberOfWheels;
	private Integer weight;
	
	public Integer getMake() {
		return make;
	}

	public void setMake(Integer make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(Integer numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}



	 void start() {
		System.out.println("Vehicle started.");
	};

	 void stop() {
		System.out.println("Vehicle stopped.");
	};

	 void drive(Integer numberOfMilesDriven) {
		System.out.println("Vehicle driven " + numberOfMilesDriven + " miles.");
	};

	 public void honk() {
		System.out.println("Honk Honk!");
	};

}
