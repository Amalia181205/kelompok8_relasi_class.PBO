package association.unidirectionalTugas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Film demonSlayer = new Film("Demon Slayer", 120);
        Film jujutsuKaisen = new Film("Jujutsu Kaisen", 110);
        Film chainsawMan = new Film("Chainsaw Man", 95);

        Penonton Ahmad = new Penonton("Andi", Arrays.asList(demonSlayer, jujutsuKaisen));
        Penonton Maulana = new Penonton("Budi", Arrays.asList(chainsawMan, demonSlayer));

        Ahmad.tampilkanPenonton();
        Maulana.tampilkanPenonton();
    }
}
