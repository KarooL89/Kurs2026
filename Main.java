interface PowiadomienieSerwis {
    void wyslijPowiadomienie(String odbiorca, String tresc);
}
class EmailSerwis implements PowiadomienieSerwis {
    @Override
    public void wyslijPowiadomienie(String odbiorca, String tresc){
        System.out.println("Wysyłanie meila do: " + odbiorca + "\nO treści: " + tresc);
    }
}
class SMSSerwis implements PowiadomienieSerwis{
    @Override
    public void wyslijPowiadomienie(String odbiorca, String tresc){
        System.out.println("Wysyłanie sms do " + odbiorca + "\nO treści: " + tresc);
    }
}
class ProcesZamowienia{
    private final PowiadomienieSerwis powiadomienieSerwis;
    public ProcesZamowienia(PowiadomienieSerwis powiadomienieSerwis){
        this.powiadomienieSerwis = powiadomienieSerwis;
    }
    public void finalizujZamowienie(String klient){
        String tresc = "Twoje zamówienie zostało przyjęte i jest w trakcie realizacji";
        powiadomienieSerwis.wyslijPowiadomienie(klient, tresc);
        System.out.println("Zamówienie dla: " + klient + " zostało zrealizowane :)");
    }
}
public class Main{
    static void main() {
        PowiadomienieSerwis emailSerwis = new EmailSerwis();
        ProcesZamowienia procesEmail = new ProcesZamowienia(emailSerwis);
        procesEmail.finalizujZamowienie("Karol.Drewniak@gmail.com");

        System.out.println();

        PowiadomienieSerwis smsSerwis = new SMSSerwis();
        ProcesZamowienia procesSMS = new ProcesZamowienia(smsSerwis);
        procesSMS.finalizujZamowienie("+48 666 777 888");
    }
}
