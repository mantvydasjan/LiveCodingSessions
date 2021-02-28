package codingInGroupsFunctionalProgramming;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TrainerDatabase {

    public static List<Trainer> trainerList = new ArrayList<>();

    public void constructTrainerList() {
        trainerList.add(new Trainer("Mykolas", "Jakubka", LocalDate.of(1981, 4, 7), true));
        trainerList.add(new Trainer("Kestutis", "Majauskas", LocalDate.of(1982, 5, 8), true));
        trainerList.add(new Trainer("Tadas", "Bundulas", LocalDate.of(1983, 6, 9), false));
    }


}
