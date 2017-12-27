package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Customer cust1 = new Customer("John", "New Delhi", 12000);
		
		Vehicle vehicle = new Vehicle("Honda", "City", 13000);
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, true);
	}

}
