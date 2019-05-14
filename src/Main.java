public class Main {

    public static void main(String[] args) {
        System.out.println("\nZad 1:");
        Ksiazka ksiazka1 = new Ksiazka("Ojciec Chrzestny", "Mario Puzo", 500);
        Ksiazka ksiazka2 = new Ksiazka("Kobiety", "Charles Bukowski", 470);
        ksiazka1.coToZaKsiazka();
        System.out.println(ksiazka1.czytaj(510));
        System.out.println(ksiazka1.czytaj(510));

        System.out.println("\nZad 2:");
        Czlowiek czlowiek1 = new Czlowiek("Rafal", "Konski");
        Czlowiek czlowiek2 = new Czlowiek();
        System.out.println(czlowiek1.przedstawSie());
        System.out.println(czlowiek2.przedstawSie());

        System.out.println("\nZad 3:");
        Samochod samochod1 = new Samochod("Mercedes", "granatowy", 45, 403000, 6);
        samochod1.coToZaAuto();
        System.out.println(samochod1.getIloscPaliwa());
        System.out.println(samochod1.getPrzebieg());
        samochod1.jedz(20);
        System.out.println(samochod1.getPrzebieg());
        System.out.println(samochod1.getIloscPaliwa());
        samochod1.tankuj(5);
        System.out.println(samochod1.getIloscPaliwa());
    }
}
