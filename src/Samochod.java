public class Samochod {
    private String marka;
    private String kolor;
    private int iloscPaliwa;
    private int przebieg;
    private double spalanieNa100Km;
    private double pojemnoscBaku;

    public Samochod(String marka, String kolor, int iloscPaliwa, int przebieg, double spalanieNa100Km) {
        this.marka = marka;
        this.kolor = kolor;
        this.iloscPaliwa = iloscPaliwa;
        this.przebieg = przebieg;
        this.spalanieNa100Km = spalanieNa100Km / 100;
        this.pojemnoscBaku = 56;
    }

    void coToZaAuto() {
        System.out.println("Jest to auto marki " + marka + ", którego kolor jest " + kolor + ".");
    }

    public int getIloscPaliwa() {
        return iloscPaliwa;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    void jedz(int kilometry) {
        if (iloscPaliwa < (kilometry * spalanieNa100Km)) {
            double przejechane = iloscPaliwa / spalanieNa100Km;
            iloscPaliwa = 0;
            System.out.println("Przejechałeś " + przejechane + "km i skończyło ci się paliwo.");
            przebieg += przejechane;
        } else {
            przebieg += kilometry;
            iloscPaliwa -= kilometry * spalanieNa100Km;
            System.out.println("Przejechałeś " + kilometry + "km.");
        }
    }

    void tankuj(double iloscZatankowanego) {
        if (iloscZatankowanego > (pojemnoscBaku - iloscPaliwa)) {
            double zatankowane = pojemnoscBaku - iloscPaliwa;
            iloscPaliwa += zatankowane;
            System.out.println("Za mała pojemność baku.\nZatankowano tylko " + zatankowane + "l paliwa.");
        } else {
            iloscPaliwa += iloscZatankowanego;
            System.out.println("Zatankowano "+iloscZatankowanego+"l paliwa.");
        }
    }
}
