package composition;

import java.util.ArrayList;
public class Bioskop {
    
     private String namaBioskop;
     private ArrayList<Studio> daftarStudio = new ArrayList<>(); // composition

    public Bioskop(String namaBioskop){
        this.namaBioskop = namaBioskop;
    }

    public void tambahStudio(Studio studio){
        daftarStudio.add(studio);
    }

    public void tampilkanBioskop(){
        System.out.println("Bioskop: " + namaBioskop);
        for(Studio s : daftarStudio){
            System.out.println("Studio : " + s.getNamaStudio());
            s.tampilkanFilm();
        }
    }
}



