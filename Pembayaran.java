package MetodePembayaran;

abstract class Pembayaran {
    protected String NomorAkun;

    public Pembayaran(String NomorAkun) {
        this.NomorAkun = NomorAkun;
    }

    public abstract boolean PembayaranValid();

    public void prosespembayaran(double jumlah) {
        if (PembayaranValid()) {
            System.out.println("Pembayaran " + jumlah + " proses pembayaran berhasil digunakan " + this.getClass().getSimpleName());
        } else {
            System.out.println("Pembayaran gagal. Tidak valid  " + this.getClass().getSimpleName());
        }
    }
}

