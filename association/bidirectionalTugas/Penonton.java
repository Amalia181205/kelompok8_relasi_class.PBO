package association.bidirectionalTugas;


import java.util.List;

public class Penonton {
    String nama;
    List<Film> daftarFilm; 

    Penonton(String nama, List<Film> daftarFilm) {
        this.nama = nama;
        this.daftarFilm = daftarFilm;

        for (Film f : daftarFilm){
            f.tambahkanPenonton(this);
        }
    }


    void tampilkanPenonton() {
        System.out.println("Nama Penonton: " + nama);
        System.out.println("Daftar Film yang Ditonton:");
        for (Film f : daftarFilm) {
            System.out.println("- " + f.judul + " (" + f.durasi + " menit)");
        }
        System.out.println();
    }
}
