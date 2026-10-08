interface Pracujacy {
    void pracuj();
}

interface DostepDoSerwerowni {
    void otwórzDrzwiSerwerowni();
}

class PracownikAdministracji implements Pracujacy {
    private String imie;

    public PracownikAdministracji(String imie) {
        this.imie = imie;
    }

    @Override
    public void pracuj() {
        System.out.println(imie + " zajmuje się biurem");
    }
}

class AdministratorSieci implements Pracujacy, DostepDoSerwerowni {
    private String imie;

    public AdministratorSieci(String imie) {
        this.imie = imie;
    }

    @Override
    public void pracuj() {
        System.out.println(imie + " zarządza siecią.");
    }

    @Override
    public void otwórzDrzwiSerwerowni() {
        System.out.println(imie + " otwiera serwerownię.");
    }
}

public class Main {
    public static void main(String[] args) {
        Pracujacy admin = new PracownikAdministracji("Anna");
        Pracujacy adminSieci = new AdministratorSieci("Marek");

        admin.pracuj();
        adminSieci.pracuj();

        DostepDoSerwerowni osobaZDostepem = new AdministratorSieci("Marek");
        osobaZDostepem.otwórzDrzwiSerwerowni();
    }
}
