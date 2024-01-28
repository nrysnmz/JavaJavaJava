package car_dealership;

public class Dealership {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setName("Jack");
        customer1.setAddress("123 None St.");
        customer1.setCashOnHand(15000);

        Vehicle vehicle = new Vehicle("Honda","Accord",10000);

        Employee employee= new Employee();


        customer1.purchaseCar(vehicle, employee, false);

    }
}
