public class Discount {
    private String productId;
    private float discountAmount;

    public Discount(String productId, float discountAmount) {
        this.productId = productId;
        this.discountAmount = discountAmount;
    }

    public String getProduct() {
        return this.productId;
    }

    public float getDiscountAmount() {
        return this.discountAmount;
    }

    @Override
    public String toString() {
        return "[ " + this.productId + " - " + this.discountAmount + "]";
    }
}
