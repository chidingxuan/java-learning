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
        Customer found = findByID(customers, 999);
        if (found == null) {
            System.out.println("没有 id=999 的客户");
        } else {
            System.out.println(found.name);
        }
    }

    static Customer findByID(List<Customer> customers, int id) {
        for (Customer c : customers){
            if(c.id == id){
                return c;
            }
        }
        return null;
    }
}
