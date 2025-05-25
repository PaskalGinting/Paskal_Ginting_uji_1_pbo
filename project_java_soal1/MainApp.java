public class MainApp {
    public static void main(String[] args) {
        // Demonstrasi polymorphism
        Vehicle v1 = new Car();           // Polymorphism: referensi Vehicle, objek Car
        Vehicle v2 = new Motorcycle();    // Polymorphism: referensi Vehicle, objek Motorcycle

        v1.startEngine(); // Memanggil versi Car
        v2.startEngine(); // Memanggil versi Motorcycle

        // Cek dan gunakan interface
        if (v1 instanceof Electric) {
            ((Electric) v1).chargeBattery(); // Casting untuk panggil method interface
        }
    }
}