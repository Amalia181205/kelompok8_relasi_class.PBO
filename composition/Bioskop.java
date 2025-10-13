package composition;

import java.util.ArrayList;
public class Bioskop {
    
     private String namaBioskop;
     // Daftar studio yang dimiliki bioskop (studio tidak bisa berdiri tanpa bioskop)
     private ArrayList<Studio> daftarStudio = new ArrayList<>(); 
     
     // Metode untuk menambahkan studio ke dalam daftar bioskop
    public Bioskop(String namaBioskop){
        this.namaBioskop = namaBioskop;
    }

    // Metode untuk menambahkan studio ke dalam daftar bioskop
    public void tambahStudio(Studio studio){
        daftarStudio.add(studio);
    }

    // Metode untuk menampilkan informasi bioskop dan seluruh studionya
    public void tampilkanBioskop(){
        System.out.println("Bioskop: " + namaBioskop);
        for(Studio s : daftarStudio){
            System.out.println("Studio : " + s.getNamaStudio());
            s.tampilkanFilm();
        }
    }
}



