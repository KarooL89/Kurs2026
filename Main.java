interface MetodaPlatnosci {
    void zaplac(double kwota);
}

class PlatnoscKarta implements MetodaPlatnosci {
    @Override
    public void zaplac(double kwota) {
        System.out.println("Płatność kartą: " + kwota + " zł");
    }
}

class PlatnoscBlik implements MetodaPlatnosci {
    @Override
    public void zaplac(double kwota) {
        System.out.println("Bliczek: " + kwota + " zł");
    }
}

class PlatnoscPayPal implements MetodaPlatnosci {
    @Override
    public void zaplac(double kwota) {
        System.out.println("PayPal: " + kwota + " zł");
    }
}

class SystemPlatnosci {
    public void wykonajPlatnosc(MetodaPlatnosci metoda, double kwota) {
        metoda.zaplac(kwota);
    }
}

public class Main {
    public static void main(String[] args) {
        SystemPlatnosci system = new SystemPlatnosci();

        MetodaPlatnosci karta = new PlatnoscKarta();
        MetodaPlatnosci blik = new PlatnoscBlik();
        MetodaPlatnosci paypal = new PlatnoscPayPal();

        system.wykonajPlatnosc(karta, 1150.00);
        system.wykonajPlatnosc(blik, 155.50);
        system.wykonajPlatnosc(paypal, 3320.00);
    }
}
