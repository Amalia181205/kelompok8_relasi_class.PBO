package depedency;

public class Main {
    public static void main(String[] args){
        Penonton penonton1 = new Penonton("Cantika");
        Film film1 = new Film("Rangga Dan Cinta");

        penonton1.menontonFilm(film1);
    }
}
