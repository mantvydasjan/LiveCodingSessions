package codingInGroupsFunctionalProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class GroupSortingService {

    public static void lastNameSortAlphabeticly(List<Group> studentGroup) {

        System.out.println("Student last names alphabetically: ");

        for (Group group : studentGroup) {
            System.out.println(group.getName());
            group.getStudentList().stream().sorted(Comparator.comparing(Student::getLastName))
                    .collect(Collectors.toList())
                    .forEach(student -> System.out.println(student.getLastName()));

        }


    }


    public Group groupWithMaxNumberOfStudents(List<Group> groupList) {
        Group groupMaxNumberOfStudents = groupList
                .stream()
                .max(Comparator.comparing(Group::getListSize))
                .orElseThrow(NoSuchElementException::new);
        return groupMaxNumberOfStudents;

    }


//        public void studentsYoungerThan25 (List < Group > groupList) {
//            List<Student> students = new ArrayList<>();
//            for (Group group : groupList) {
//                List<Student> studentList = group.getStudentList().stream()
//                        .filter(student -> Period.between(student.getDateOfBirth(), LocalDate.now()).getYears() > 25)
//                        .collect(Collectors.toList());
//                students.addAll(studentList);
//            }
//            System.out.println("Students younger than 25: ");
//            students.forEach(System.out::println);

}
