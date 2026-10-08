interface Włączalne {
    void włącz();
    void wyłącz();
}

interface Ściemnialne {
    void ustawJasność(int poziom);
}

interface OdtwarzaczAudio {
    void odtwarzaj(String utwór);
}

interface CzujnikPomiarowy {
    double pobierzOdczyt();
}

class InteligentnaŻarówka implements Włączalne, Ściemnialne {
    private boolean włączona = false;
    private int jasność = 100;

    @Override
    public void włącz() {
        włączona = true;
        System.out.println("Żarówka włączona");
    }

    @Override
    public void wyłącz() {
        włączona = false;
        System.out.println("Żarówka wyłączona");
    }

    @Override
    public void ustawJasność(int poziom) {
        jasność = poziom;
        System.out.println("Jasność ustawiona na: " + poziom + "%");
    }
}

class InteligentnyGłośnik implements Włączalne, OdtwarzaczAudio {
    private boolean włączony = false;

    @Override
    public void włącz() {
        włączony = true;
        System.out.println("Głośnik włączony");
    }

    @Override
    public void wyłącz() {
        włączony = false;
        System.out.println("Głośnik wyłączony");
    }

    @Override
    public void odtwarzaj(String utwór) {
        System.out.println("Odtwarzanie: " + utwór);
    }
}

class CzujnikDymu implements CzujnikPomiarowy {
    @Override
    public double pobierzOdczyt() {
        double stezenie = 0.03;
        System.out.println("Stężenie dymu: " + stezenie);
        return stezenie;
    }
}

public class Main {
    public static void main(String[] args) {
        InteligentnaŻarówka zarowka = new InteligentnaŻarówka();
        zarowka.włącz();
        zarowka.ustawJasność(60);
        zarowka.wyłącz();

        InteligentnyGłośnik glosnik = new InteligentnyGłośnik();
        glosnik.włącz();
        glosnik.odtwarzaj("Imagine - John Lennon");
        glosnik.wyłącz();

        CzujnikDymu czujnik = new CzujnikDymu();
        czujnik.pobierzOdczyt();
    }
}
