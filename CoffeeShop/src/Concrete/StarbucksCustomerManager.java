package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerService, CustomerCheckService {

   private CustomerCheckService customerCheckService;

    @Override
    public void save(Customer customer) {
        System.out.println("Starbucks Customer Add ");

    }


    @Override
    public boolean ChecIfRealsPerson(Customer customer) {
        if (customerCheckService.ChecIfRealsPerson(customer)){
            System.out.println("Starbucks Customer Added.");
            save(customer);
        }else {
            System.out.println("Error!" + customer.getFirstName() + "is not a valid person");
        }
        return true;
    }
}
