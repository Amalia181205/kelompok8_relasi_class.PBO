package composition;

public class Main {
    
    public static void main(String[] args){
        Bioskop bioskop = new Bioskop("Cinema XXI");

        // Studio 1
        Studio studio1 = new Studio("Studio 1");
        studio1.tambahFilm("Rangga Dan Cinta", 119);

        // Studio 2
        Studio studio2 = new Studio("Studio 2");
        studio2.tambahFilm("Gundik", 112);

        // Tambahkan studio ke bioskop
        bioskop.tambahStudio(studio1);
        bioskop.tambahStudio(studio2);

        // Tampilkan bioskop
        bioskop.tampilkanBioskop();
    }
}
