/**
 * 
 */

/**
 * @author Lenovo
 *
 */
public class ElectricVehicle {

//Inheritance: Create another class called "ElectricVehicle" that inherits from the "Vehicle" class and has additional properties
//such as "batteryCapacity" and "chargeLevel". It should also have a method called "charge" that increases the charge level of the battery.
//
//Polymorphism: Override the "drive" method in the "ElectricVehicle" class to print "Electric vehicle driven X miles" 
//and demonstrate how polymorphism is achieved by calling the drive method on both "Vehicle" and "ElectricVehicle" objects.
	
	private Integer batteryCapacity;
	private Integer chargeLevel;

	public Integer getBatteryCapacity() {
		return batteryCapacity;
	}
	
	public void setBatteryCapacity(Integer batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	public Integer getChargeLevel() {
		return chargeLevel;
	}
	
	public void setChargeLevel(Integer chargeLevel) {
		this.chargeLevel = chargeLevel;
	}
void charge() {
	Integer newChargeLevel= getBatteryCapacity();
	newChargeLevel++;
	setBatteryCapacity(newChargeLevel);
}

 void drive(Integer numberOfMilesDriven) {
	System.out.println("Electric Vehicle driven " + numberOfMilesDriven + " miles.");
};

}
