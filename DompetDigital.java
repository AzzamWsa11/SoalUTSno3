package MetodePembayaran;

class DompetDigital extends Pembayaran {
    private double balance;

    public DompetDigital(String DompetID, double balance) {
        super(DompetID);
        this.balance = balance;
    }

    @Override
    public boolean PembayaranValid() {
        return balance >= 0;
    }

    public void Saldo(double amount) {
        if (PembayaranValid()) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Pembayaran berhasil ditambahkan. Saldo terkini: " + balance);
            } else {
                System.out.println("Pembayaran tidak berhasil ditambahkan.");
            }
        }
    }
}

