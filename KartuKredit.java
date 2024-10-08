package MetodePembayaran;

class KartuKredit extends Pembayaran {
    public KartuKredit(String NomorKartu) {
        super(NomorKartu);
    }

    @Override
    public boolean PembayaranValid() {
        return NomorAkun.length() == 16 && NomorAkun.matches("[0-9]+");
    }
}
