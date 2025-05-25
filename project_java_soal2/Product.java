// Abstract class Product
public abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method abstrak untuk menghitung harga total
    public abstract double calculateTotalPrice();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}