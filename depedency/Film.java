package depedency;

public class Film {
    String judul;

    // Konstruktor untuk membuat film
    Film(String judul){
        this.judul = judul;
    }

    // Method untuk mengambil judul film
    String getJudul(){
        return this.judul;
    }
}
