public class Main {
    public static void main(String[] args) {

        ProduktWSklepie laptop = new ProduktWSklepie("Laptop", 3000.0, 10);
        System.out.println(laptop);
        System.out.println();

        laptop.setCenaNetto(-1.0);
        System.out.println("Aktualna cena netto: " + laptop.getCenaNetto());
        System.out.println();

        double cenaBrutto = laptop.getCenaBrutto(0.23);
        System.out.println("Cena netto: " + laptop.getCenaNetto() + " zł");
        System.out.println("Cena brutto (VAT 23%): " + cenaBrutto + " zł");
        System.out.println();

        laptop.sprzedaj(9);
        System.out.println(laptop);
        System.out.println();

        laptop.sprzedaj(11);
        System.out.println(laptop);
        System.out.println();

        laptop.dodajDoMagazynu(1);
        laptop.setNazwa("   ");
        laptop.setNazwa("Laptop Gamingowy");
        System.out.println(laptop);
    }
}
