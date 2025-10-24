public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.addCustomer(new Customer("Alice", 1000));
        shop.addCustomer(new Customer("Bob", 2000));
        shop.addCustomer(new Customer("Carl", 4000));
        shop.addCustomer(new Customer("Daphne", 5000));

        shop.addDiscount(new Discount("abc123", 100));
        shop.addDiscount(new Discount("def456", 200));
        shop.addDiscount(new Discount("ghi789", 300));

        shop.assignDiscounts();

        for (Customer customer : shop.getCustomers()) {
            System.out.println(customer.getId() + " has discounts " + customer.getDiscounts().toString());
        }
    }
}