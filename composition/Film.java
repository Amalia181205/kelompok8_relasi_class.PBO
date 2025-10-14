package composition;

public class Film {
    String judul;
    int durasiMenit;

    Film(String judul, int durasiMenit){
        this.judul = judul;
        this.durasiMenit = durasiMenit;
    }

     // Getter judul
    String getJudul(){ 
        return judul; 
    }

    // Getter durasi
    int getDurasiMenit(){ 
        return durasiMenit; 
    }
}