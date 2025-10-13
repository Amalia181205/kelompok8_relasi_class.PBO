package composition;

import java.util.ArrayList;
public class Studio {
    
    private String namaStudio;
    private ArrayList<Film> daftarFilm = new ArrayList<>(); // composition

    public Studio(String namaStudio){
        this.namaStudio = namaStudio;
    }

    public void tambahFilm(String judul, int durasi){
        daftarFilm.add(new Film(judul, durasi));
    }

    public void tampilkanFilm(){
        System.out.println("Daftar film di " + namaStudio + " : ");
        for(Film f : daftarFilm){
            System.out.println("- " + f.getJudul() + " (" + f.getDurasiMenit() + " menit)");
        }
    }

    // Getter nama studio
    public String getNamaStudio(){ 
        return namaStudio; 
    }
}

