class Pracownik {
    private String imie;
    private double stawkaGodzinowa;
    private int przepracowaneGodziny;

    public Pracownik(String imie, double stawkaGodzinowa, int przepracowaneGodziny) {
        this.imie = imie;
        this.stawkaGodzinowa = stawkaGodzinowa;
        this.przepracowaneGodziny = przepracowaneGodziny;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public double getStawkaGodzinowa() {
        return stawkaGodzinowa;
    }

    public void setStawkaGodzinowa(double stawkaGodzinowa) {
        this.stawkaGodzinowa = stawkaGodzinowa;
    }

    public int getPrzepracowaneGodziny() {
        return przepracowaneGodziny;
    }

    public void setPrzepracowaneGodziny(int przepracowaneGodziny) {
        this.przepracowaneGodziny = przepracowaneGodziny;
    }
}

class KalkulatorPensji {
    public double oblicz(Pracownik pracownik) {
        return pracownik.getStawkaGodzinowa() * pracownik.getPrzepracowaneGodziny();
    }
}

class WydrukPaska {
    public void drukuj(Pracownik pracownik, double pensja) {
        System.out.println("Pracownik: " + pracownik.getImie());
        System.out.println("Do wypłaty: " + pensja + " zł");
    }
}

public class Main {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("Jan Kowalski", 55.50, 168);

        KalkulatorPensji kalkulator = new KalkulatorPensji();
        double pensja = kalkulator.oblicz(pracownik);

        WydrukPaska wydruk = new WydrukPaska();
        wydruk.drukuj(pracownik, pensja);
    }
}
