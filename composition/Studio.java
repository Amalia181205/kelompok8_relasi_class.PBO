package composition;

import java.util.ArrayList;
public class Studio {
    
    String namaStudio;
    // Daftar film yang ditayangkan di studio(film tidak ada tanpa studio)
    ArrayList<Film> daftarFilm = new ArrayList<>(); // composition

    Studio(String namaStudio){
        this.namaStudio = namaStudio;
    }

    // Metode untuk menambahkan film baru ke dalam studio
    void tambahFilm(String judul, int durasi){
        daftarFilm.add(new Film(judul, durasi));
    }

    // Metode untuk menampilkan daftar film di studio
    void tampilkanFilm(){
        System.out.println("Daftar film di " + namaStudio + " : ");
        for(Film f : daftarFilm){
            System.out.println("- " + f.getJudul() + " (" + f.getDurasiMenit() + " menit)");
        }
    }

    // Getter nama studio
    String getNamaStudio(){ 
        return namaStudio; 
    }
}