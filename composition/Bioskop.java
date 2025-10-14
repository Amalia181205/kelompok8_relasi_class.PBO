package composition;

import java.util.ArrayList;
public class Bioskop {
    
     String namaBioskop;
     // Daftar studio yang dimiliki bioskop (studio tidak bisa berdiri tanpa bioskop)
     ArrayList<Studio> daftarStudio = new ArrayList<>(); 
     
     // Metode untuk menambahkan studio ke dalam daftar bioskop
    Bioskop(String namaBioskop){
        this.namaBioskop = namaBioskop;
    }

    // Metode untuk menambahkan studio ke dalam daftar bioskop
    void tambahStudio(Studio studio){
        daftarStudio.add(studio);
    }

    // Metode untuk menampilkan informasi bioskop dan seluruh studionya
    void tampilkanBioskop(){
        System.out.println("Bioskop: " + namaBioskop);
        for(Studio s : daftarStudio){
            System.out.println("Studio : " + s.getNamaStudio());
            s.tampilkanFilm();
        }
    }
}