package composition;

public class Film {
    private String judul;
    private int durasiMenit;

    public Film(String judul, int durasiMenit){
        this.judul = judul;
        this.durasiMenit = durasiMenit;
    }

     // Getter judul
    public String getJudul(){ 
        return judul; 
    }

    // Getter durasi
    public int getDurasiMenit(){ 
        return durasiMenit; 
    }
}

