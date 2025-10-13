package aggregation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Buat beberapa film
        Film demonSlayer = new Film("Demon Slayer", 120);
        Film chainsawMan = new Film("Chainsaw Man", 90);
        Film jujutsuKaisen = new Film("Jujutsu Kaisen", 110);

        // Buat penonton yang menonton beberapa film (AGGREGATION)
        Penonton Ahmad = new Penonton("Ahmad", Arrays.asList(demonSlayer, jujutsuKaisen));
        Penonton Maulana = new Penonton("Maulana", Arrays.asList(chainsawMan));

        // Tampilkan data
        Ahmad.tampilkanPenonton();
        Maulana.tampilkanPenonton();
    }
}
