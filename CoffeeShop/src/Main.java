import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

    public static void main(String[] args) {


        BaseCustomerManager baseCustomerManager = new NeroCustomerManager();

        Customer customer = new Customer(1, "Mert", "Kızıloğlu", "122334564");

        baseCustomerManager.save(customer);

    }
}
