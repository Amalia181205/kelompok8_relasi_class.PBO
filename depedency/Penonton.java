package depedency;

public class Penonton {
    String nama;

    // Konstruktor untuk membuat penonton
    Penonton(String nama){
        this.nama = nama;
    }

    // Method untuk menonton film
    void menontonFilm(Film film){
        System.out.println(this.nama + " sedang menonton film : " + film.getJudul());
    }
}
