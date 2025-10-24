import java.util.List;

public class Customer {
    private String id;
    private float yearlySpending;
    private List<Discount> discounts;

    public Customer(String id, float yearlySpending) {
        this.id = id;
        this.yearlySpending = yearlySpending;
        this.discounts = new java.util.ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public float getYearlySpending() {
        return yearlySpending;
    }

    public List<Discount> getDiscounts() {
        return this.discounts;
    }

    public void setYearlySpending(float yearlySpending) {
        this.yearlySpending = yearlySpending;
    }

    public void addDiscount(Discount discount) {
        if (this.discounts.size() < 3) {
            this.discounts.add(discount);
        } else {
            throw new IllegalStateException("Cannot assign more than 3 discounts to customer: " + id);
        }
    }

    public int totalDiscountValue() {
        int totalDiscountValue = 0;
        for (Discount discount : this.discounts) {
            totalDiscountValue += discount.getDiscountAmount();
        }
        return totalDiscountValue;
    }

    public void removeDiscount(Discount discount) {
        this.discounts.remove(discount);
    }

}