package generalization;

public class Main {
    public static void main(String[] args) {
        FilmAction f1 = new FilmAction();
        f1.judul = "Avengers";
        f1.putarFilm();
        f1.efekLedakan();

        FilmDrama f2 = new FilmDrama();
        f2.judul = "Laskar Pelangi";
        f2.putarFilm();
        f2.adeganSedih();
    }
}
