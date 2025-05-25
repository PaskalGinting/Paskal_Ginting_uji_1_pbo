// Car mewarisi Vehicle dan mengimplementasikan Electric
public class Car extends Vehicle implements Electric {
    @Override
    public void startEngine() {
        System.out.println("Mobil: Menyalakan mesin dengan tombol start.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Mobil: Mengisi baterai kendaraan listrik.");
    }
}