package association.bidirectionalTugas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Film demonSlayer = new Film("Demon Slayer", 120);
        Film jujutsuKaisen = new Film("Jujutsu Kaisen", 110);
        Film chainsawMan = new Film("Chainsaw Man", 95);

        Penonton andi = new Penonton("Andi", Arrays.asList(demonSlayer, jujutsuKaisen));
        Penonton budi = new Penonton("Budi", Arrays.asList(chainsawMan, demonSlayer));

        // Tampilkan dari sisi Penonton
        andi.tampilkanPenonton();
        budi.tampilkanPenonton();

        // Tampilkan dari sisi Film
        demonSlayer.tampilkanInfo();
        jujutsuKaisen.tampilkanInfo();
        chainsawMan.tampilkanInfo();
    }
}
