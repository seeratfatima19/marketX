package marketX;
import marketX.Gender;
import marketX.Customer;
import java.util.*;
import java.util.stream.*;
public class StreamOps {

    List<Customer> customers;

    StreamOps()
    {
        customers = new ArrayList<Customer>();

        customers.add(new Customer("Richard Joe", 30, "New York", Gender.MALE, 100.0));
        customers.add(new Customer("Jane Smith", 35, "Los Angeles", Gender.FEMALE, 150.0));
        customers.add(new Customer("Bob Johnson", 26, "New York", Gender.MALE, 80.0));
        customers.add(new Customer("Alice Brown", 28, "Chicago", Gender.FEMALE, 120.0));
        customers.add(new Customer("Mike Davis", 39, "New York", Gender.MALE, 200.0));
        customers.add(new Customer("Emily Lee", 38, "Chicago", Gender.FEMALE, 180.0));
        customers.add(new Customer("Chris Wilson", 32, "San Francisco", Gender.OTHER, 90.0));
    }

    public List<Customer> filterCustomers()
    {
        this.customers = this.customers.stream().filter(customer -> customer.getAge()>25 && customer.getAge()<40).filter(customer -> customer.getCity().equals("New York")).filter(customer -> customer.getGender()==Gender.MALE || customer.getGender()== Gender.FEMALE).collect(Collectors.toList());
        return this.customers;

    }

    public List<String> mapCustomers()
    {
        List<String> namesList = this.customers.stream().map(customer->customer.getName()).sorted().collect(Collectors.toList());
        return namesList;
    }

    public double totalPurchaseAmount(){
        double totalPurchaseAmount = this.customers.stream()
                .mapToDouble(Customer::getPurchaseAmount)
                .sum();
        return totalPurchaseAmount;
    }

    public Customer highestPurchaseAmount(){

        return customers.stream()
                .max((c1, c2) -> Double.compare(c1.getPurchaseAmount(), c2.getPurchaseAmount()))
                .orElse(null);
    }

    public Map<String, Double> averagePurchaseByCity(){
        return this.customers.stream()
                .collect(Collectors.groupingBy(Customer::getCity, Collectors.averagingDouble(Customer::getPurchaseAmount)));
    }

}
