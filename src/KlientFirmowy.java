public class KlientFirmowy extends Klient {
  // zamienić nip i regon na Nip i Regon (duze litery)
    private final String nip;
    private final String regon;

    public KlientFirmowy(String imie, String nazwisko, Adres adres, String nip, String regon) {
        super(imie, nazwisko, adres);
        if (nip == null || nip.isEmpty() || nip.length() != 10) {
            throw new IllegalArgumentException("NIP musi mieć 10 znaków.");
        }
        if (regon == null || regon.isEmpty() || regon.length() != 9) {
            throw new IllegalArgumentException("REGON musi mieć 9 znaków.");
        }
        this.nip = nip;
        this.regon = regon;
    }

    public String getNip() {
        return nip;
    }

    public String getRegon() {
        return regon;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTyp klienta: Firmowy\nNIP: " + nip + "\nREGON: " + regon;
    }
}
