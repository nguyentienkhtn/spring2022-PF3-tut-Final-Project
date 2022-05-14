package control;

import model.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerMap {
    private Map<String, Customer> customers;

    public CustomerMap() {
        customers = new HashMap<>();
    }

    public boolean contains(String id)
    {
        return customers.containsKey(id);
    }

    public void register(Customer customer){
        customers.put(customer.getId(), customer);
    }

    public int size()
    {
        return customers.size();
    }
}
