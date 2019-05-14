public class Ksiazka {
    private String tytul;
    private String autor;
    private int iloscStron;
    private int iloscPrzeczytanychStron = 0;

    public Ksiazka(String tytul, String autor, int iloscStron) {
        this.tytul = tytul;
        this.autor = autor;
        this.iloscStron = iloscStron;
    }

    void coToZaKsiazka() {
        System.out.println("Jest to książka o tytule '" + this.tytul +
                "' , napisana przez " + this.autor + ".\n" + "Przeczytałeś z niej "
                + this.iloscPrzeczytanychStron + " stron");
    }

    boolean czyPrzeczytana() {
        if (iloscPrzeczytanychStron == iloscStron) {
            return true;
        } else {
            return false;
        }
    }

    String czytaj(int iloscStron) {
        if (czyPrzeczytana()) {
            return "Już ją przeczytałeś!";
        } else if (iloscPrzeczytanychStron + iloscStron > this.iloscStron) {
            iloscPrzeczytanychStron = this.iloscStron;
            return "Za dużo chcesz czytać\nPrzeczytałeś " + this.iloscStron + " stron.";
        } else {
            iloscPrzeczytanychStron += iloscStron;
            return "Przeczytałeś " + iloscStron + " stron.";
        }
    }
}






