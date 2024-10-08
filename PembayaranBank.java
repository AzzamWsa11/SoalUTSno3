package MetodePembayaran;

class PembayaranBank extends Pembayaran {
    public PembayaranBank(String Mbanking) {
        super(Mbanking);
    }

    @Override
    public boolean PembayaranValid() {
        return NomorAkun.length() == 10 && NomorAkun.matches("[0-9]+");
    }
}
