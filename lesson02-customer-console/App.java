import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(0, "小明", "23134123", 0));
        customers.add(new Customer(1, "dasdsad", "213213", 1));
        customers.add(new Customer(2, "dsadw", "321321321", 2));

        for(Customer c : customers){
            System.out.println(c);
        }
    }
}
