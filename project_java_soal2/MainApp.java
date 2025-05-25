public class MainApp {
    public static void main(String[] args) {
        Product[] cart = new Product[3];
        cart[0] = new Food("Nasi Goreng", 20000);
        cart[1] = new Beverage("Es Teh", 10000);
        cart[2] = new Beverage("Kopi", 15000);

        double total = 0;

        System.out.println("Daftar Belanja:");
        for (Product p : cart) {
            System.out.println("- " + p.getName() + ": Rp" + p.calculateTotalPrice());
            total += p.calculateTotalPrice();
        }

        System.out.println("\nTotal Bayar: Rp" + total);
    }
}