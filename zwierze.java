public class Zwierze {
    String gatunek;
    int wiekZwierzecia;

    public Zwierze(String gatunek, int wiekZwierzecia) {
        this.gatunek = gatunek;
        this.wiekZwierzecia = wiekZwierzecia;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public int getWiekZwierzecia() {
        return wiekZwierzecia;
    }

    public void setWiekZwierzecia(int wiekZwierzecia) {
        this.wiekZwierzecia = wiekZwierzecia;
    }

    public void opis(){
        System.out.println("Gatunek: " + gatunek + " wiek: "+ wiekZwierzecia);

    }
}
