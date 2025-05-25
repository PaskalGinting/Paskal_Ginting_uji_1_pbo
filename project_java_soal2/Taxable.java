// Interface untuk produk kena pajak
public interface Taxable {
    double TAX_RATE = 0.1; // 10% pajak

    double calculateTax();
}