// Makanan tidak kena pajak
public class Food extends Product {
    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTotalPrice() {
        return price; // Tidak dikenakan pajak
    }
}