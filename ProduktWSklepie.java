public class ProduktWSklepie {
    private String nazwa;
    private double cenaNetto;
    private int iloscNaMagazynie;

    public ProduktWSklepie(String nazwa, double cenaNetto, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cenaNetto = cenaNetto;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCenaNetto() {
        return cenaNetto;
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public void setNazwa(String nazwa) {
        if (nazwa.trim().isEmpty()){
            System.out.println("Nazwa nie może być pusta!");
            return;
        }
        this.nazwa = nazwa;
    }

    public void setCenaNetto(double cenaNetto) {
        if (cenaNetto > 0) {
            this.cenaNetto = cenaNetto;
        } else {
            System.out.println("Cena netto musi być większa od 0!");
        }
    }
    public double getCenaBrutto (double stawkaVat){
        return cenaNetto *(1 + stawkaVat);
    }
    public void dodajDoMagazynu (int ilosc){
        if (ilosc >0) {
            iloscNaMagazynie += ilosc;
            System.out.println("Dodano " + ilosc + " szt. do magazynu, aktualny stan: " + iloscNaMagazynie);
        } else {
            System.out.println("Ilość musi być dodatnia!");
        }
    }
    public void sprzedaj (int ilosc){
        if (ilosc <= 0){
            System.out.println("Ilość sprzedaży musi być dodatnia");
            return;
        }
        if (ilosc > iloscNaMagazynie){
            System.out.println("Brak wystarczającej ilości towaru w magazynie, aktualny stan: "+ iloscNaMagazynie);
            return;
        }
        iloscNaMagazynie -= ilosc;
        System.out.println("Sprzedano: " + ilosc + " szt. Stan magazynu: " + iloscNaMagazynie);
    }
    @Override
    public String toString(){
        return "Produkt: " + nazwa + ", cena netto: " + cenaNetto + "zł. \nIlość na magazynie: " + iloscNaMagazynie;
    }


}
