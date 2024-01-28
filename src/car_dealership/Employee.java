package car_dealership;

public class Employee {
    public void handleCustomer(Customer customer1, boolean finance, Vehicle vehicle) {
        if (finance == true) {
            double loanAmount = vehicle.getPrice() - customer1.getCashOnHand();
            runCreditHistory(customer1, loanAmount);
        } else if (vehicle.getPrice() <= customer1.getCashOnHand()) {
            processTransaction(customer1, vehicle);
        } else {
            System.out.println("Customer will need more money to purchase vehicle: " + vehicle);
        }
    }

    public void runCreditHistory(Customer customer, double loanAmount) {
        System.out.println("Ran credit history for Customer...");
        System.out.println("Customer has been approved to purchase the vehicle.");
    }

    public void processTransaction(Customer customer, Vehicle vehicle) {
        System.out.println("Customer has purchased the vehicle:" + vehicle + "for the price " + vehicle.getPrice());

    }
}
