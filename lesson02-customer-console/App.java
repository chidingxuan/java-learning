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
        System.out.println("修改 id=1 的电话 -> " + updatePhone(customers, 1, "13800001111"));
        System.out.println("改完: " + findByID(customers, 1));

        System.out.println("删除 id=1 -> " + remove(customers, 1));
        for (Customer c : customers) {
            System.out.println(c);
        }
        System.out.println("再查 id=1 -> " + findByID(customers, 1));
    }

    static Customer findByID(List<Customer> customers, int id) {
        for (Customer c : customers){
            if(c.id == id){
                return c;
            }
        }
        return null;
    }

    static boolean remove(List<Customer> customers, int id){

        for (Customer c : customers){
            if(id == c.id){
                customers.remove(c);
                return true;
            }
        }

        return false;
    }

    static boolean updatePhone(List<Customer> customers, int id, String phone){

        for (Customer c: customers){
            if(id == c.id){
                c.phone = phone;
                return true;
            }
        }

        return false;
    }
}
