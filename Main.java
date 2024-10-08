package MetodePembayaran;


public class Main {
    public static void main(String[] args) {
       Pembayaran KartuKredit = new KartuKredit("1234567890123456");
       Pembayaran DompetDigital = new DompetDigital("Gopay", 7000);
       Pembayaran PembayaranBank = new PembayaranBank("9876543210");

        
        System.out.println("=== Credit Card Payment ===");
        KartuKredit.prosespembayaran(200);

        System.out.println("\n=== Digital Wallet Payment ===");
        DompetDigital.prosespembayaran(300);
        ((DompetDigital) DompetDigital).Saldo(300);

        System.out.println("\n=== Bank Transfer Payment ===");
        PembayaranBank.prosespembayaran(150);
    }
}

