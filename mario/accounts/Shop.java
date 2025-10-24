import java.util.List;

public class Shop {
    private List<Customer> customers;
    private List<Discount> discounts;

    public Shop() {
        this.customers = new java.util.ArrayList<>();
        this.discounts = new java.util.ArrayList<>();
    }

    public Shop(List<Customer> customers, List<Discount> discounts) {
        this.customers = customers;
        this.discounts = discounts;
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return this.customers;
    }

    public void addDiscount(Discount discount) {
        this.discounts.add(discount);
    }

    public void assignDiscounts() {
        this.customers.sort((c1, c2) -> Double.compare(c2.getYearlySpending(), c1.getYearlySpending()));
        for (Discount discount : this.discounts) {
            for (Customer customer : this.customers) {
                if (customer.getDiscounts().size() < 3 &&
                        customer.totalDiscountValue() + discount.getDiscountAmount() <= 0.2
                                * customer.getYearlySpending()) {
                    customer.addDiscount(discount);
                    break; // move to next discount
                }
            }
        }
    }

}