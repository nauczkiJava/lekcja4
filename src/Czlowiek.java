public class Czlowiek {
    private String imie;
    private String nazwisko;

    Czlowiek(){
        imie = "Adam";
        nazwisko = "Kowalski";
    }

    public Czlowiek(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    String przedstawSie() {
        return "Nazywam się " + imie + " " + nazwisko;
    }
}
