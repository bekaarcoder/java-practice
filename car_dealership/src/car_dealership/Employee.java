package car_dealership;

public class Employee {
	public void handlePurchase(Customer cust, Vehicle vehicle, boolean finance ) {
		if(finance == true) {
			if(vehicle.getPrice() <= cust.getCash()) {
				processTransaction(cust, vehicle);
			} else {
				double loanAmount = vehicle.getPrice() - cust.getCash();
				runCreditHistory(cust, vehicle, loanAmount);
			}
		} else if(vehicle.getPrice() <= cust.getCash()) {
			processTransaction(cust, vehicle);
		} else {
			System.out.println("Customer needs more money to make a purchase.");
		}
	}
	
	public void runCreditHistory(Customer cust, Vehicle vehicle, double loanAmount) {
		System.out.println("Ran Credit History...");
		System.out.println("Customer is approved to purchase the vehicle " + vehicle.getMake() + " " + vehicle.getModel() + " with a load amount of " + loanAmount);
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println("Purchase is successful for the vehicle " + vehicle.toString());
	}
}
