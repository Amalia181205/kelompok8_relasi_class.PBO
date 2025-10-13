package realization;

public class Main {
    public static void main(String[] args) {
        Tiket vip = new TiketVIP();
        vip.cetakTiket();
        vip.hitungHarga();

        Tiket reguler = new TiketReguler();
        reguler.cetakTiket();
        reguler.hitungHarga();
    }
}