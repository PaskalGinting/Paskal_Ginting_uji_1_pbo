// Minuman dikenakan pajak
public class Beverage extends Product implements Taxable {
    public Beverage(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTotalPrice() {
        return price + calculateTax();
    }

    @Override
    public double calculateTax() {
        return price * TAX_RATE;
    }
}