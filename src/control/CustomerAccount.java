package control;

import model.Customer;

public class CustomerAccount implements Comparable<CustomerAccount>{
    private Customer customer;
    private double spent;

    public CustomerAccount(Customer customer, double spent) {
        this.customer = customer;
        this.spent = spent;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getSpent() {
        return spent;
    }

    public void setSpent(double spent) {
        this.spent = spent;
    }

    @Override
    public String toString() {
        return "CustomerAccount{" +
                "customer=" + customer +
                ", spent=" + spent +
                '}';
    }

    @Override
    public int compareTo(CustomerAccount o) {
        return (int)((this.spent-o.spent)*100);
    }
}
