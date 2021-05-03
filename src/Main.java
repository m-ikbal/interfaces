import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        Customer customer = new Customer(1, "anonymous", "anonymous", new Date(1212), 1);
        customerManager.save(customer);
    }
}
