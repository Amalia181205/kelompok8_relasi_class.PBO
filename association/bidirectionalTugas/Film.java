package association.bidirectionalTugas;

import java.util.ArrayList;
import java.util.List;

public class Film {
    String judul;
    int durasi; 
    List<Penonton> daftarPenonton;

    Film(String judul, int durasi) {
        this.judul = judul;
        this.durasi = durasi;
        this.daftarPenonton = new ArrayList<>();
    }

    void tambahkanPenonton(Penonton p) {
        daftarPenonton.add(p);
    }

    void tampilkanInfo() {
        System.out.println("Judul Film : " + judul);
        System.out.println("Daftar Penonton");
        for (Penonton p : daftarPenonton) {
            System.out.println("-  " + p.nama);
        }
        System.out.println();
    }
}
