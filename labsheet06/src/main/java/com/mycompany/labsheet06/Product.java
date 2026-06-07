public class Product {

    private String productName;
    private double unitPrice;
    private int quantity;

    // Constructor
    public Product(String productName, double unitPrice, int quantity) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    // Getter Methods
    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    // Calculate Total
    public double calculateTotal() {
        return unitPrice * quantity;
    }

    // Stock Status
    public String getStockStatus() {
        if (quantity < 5) {
            return "Low Stock";
        } else {
            return "Available";
        }
    }
}