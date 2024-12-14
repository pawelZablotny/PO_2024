public class KlientIndywidualny extends Klient {
    private final String pesel;

    public KlientIndywidualny(String imie, String nazwisko, Adres adres, String pesel) {
        super(imie, nazwisko, adres);
        if (pesel == null || pesel.isEmpty() || pesel.length() != 11) {
            throw new IllegalArgumentException("PESEL musi mieć 11 znaków.");
        }
        this.pesel = pesel;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTyp klienta: Indywidualny\nPESEL: " + pesel;
    }
}
