package wyjatki;

public class Zegar {

    private int godzina;
    private int minuta;

    public Zegar(int godzina, int minuta) {

        if (godzina < 0 || godzina > 23 || minuta < 0 || minuta > 59) {
            throw new IllegalArgumentException("Niepoprawna godzina");
        }
        this.godzina = godzina;
        this.minuta = minuta;
    }

    public Zegar roznicaCzasu(Zegar z) {
        int minuty = this.godzina * 60 + this.minuta;
        int minutyZ = z.godzina * 60 + z.minuta;
        int roznicaMin = minutyZ - minuty;

        if (roznicaMin < 0) {
            roznicaMin += 24 * 60;
        }

        return new Zegar(roznicaMin / 60, roznicaMin % 60);
    }

    private String doklejZero(int n) {
        String wynik = String.valueOf(n);
        if (n < 10) {
            wynik = "0" + wynik;
        }
        return wynik;
    }

    @Override
    public String toString() {

        return doklejZero(this.godzina) + ":" + doklejZero(this.minuta);
    }

}
