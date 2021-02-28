package codingInGroupsFunctionalProgramming;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDatabase {

    public static List<Student> studentList = new ArrayList<>();

    public void constructStudentList() {

        studentList.add(new Student("Rokas", "Jasaitis", LocalDate.of(1960, 5, 1), true));
        studentList.add(new Student("Paulius", "Paulauskas", LocalDate.of(1991, 2, 4), false));
        studentList.add(new Student("Dovydas", "Dovydauskas", LocalDate.of(1988, 1, 12), true));
        studentList.add(new Student("Irmantas", "Irmantauskas", LocalDate.of(1980, 10, 19), false));
        studentList.add(new Student("Monika", "Salciute", LocalDate.of(1992, 8, 14), false));
        studentList.add(new Student("Anton", "Antanaitis", LocalDate.of(1995, 10, 18), true));
        studentList.add(new Student("Lukas", "Jovaisa", LocalDate.of(1971, 7, 29), true));
        studentList.add(new Student("Inga", "Antanaite", LocalDate.of(1996, 7, 3), true));
        studentList.add(new Student("Arunas", "Arunaitis", LocalDate.of(1960, 2, 1), true));
        studentList.add(new Student("Zilvinas", "Zilvinaitis", LocalDate.of(1980, 12, 27), false));
        studentList.add(new Student("Jonas", "Jonaitis", LocalDate.of(1991, 5, 9), true));
        studentList.add(new Student("Gytis", "Ivaskevicius", LocalDate.of(1994, 4, 9), false));
        studentList.add(new Student("Darius", "Daraitis", LocalDate.of(1971, 7, 3), true));
        studentList.add(new Student("Eivydas", "Ivasko", LocalDate.of(1993, 8, 10), false));
        studentList.add(new Student("Tomas", "Tomaitis", LocalDate.of(1971, 4, 18), true));

    }



}
