package aggregation;

public class Film {
    String judul;
    int durasi; // dalam menit

    Film(String judul, int durasi) {
        this.judul = judul;
        this.durasi = durasi;
    }

    void tampilkanInfo() {
        System.out.println("Judul Film : " + judul);
        System.out.println("Durasi     : " + durasi + " menit");
    }
}
