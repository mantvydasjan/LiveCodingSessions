package codingInGroupsFunctionalProgramming;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class GroupDatabase {

    public static List<Group> groupList = new ArrayList();

    public static List<Group> getGroupList() {
        return groupList;
    }

//public static Set<Student> studentGroup = new HashSet<>();
//
//    public static void constructStudentGroup() {
//
//        studentGroup.add(StudentDatabase.studentList.get(0));
//        studentGroup.add(StudentDatabase.studentList.get(1));
//        studentGroup.add(StudentDatabase.studentList.get(2));
//        studentGroup.add(StudentDatabase.studentList.get(3));
//
//    }


    public void constructGroups() {

        try {

            Group group1 = new Group();
            group1.setName("Vilniusjava10");
            group1.setTrainer(TrainerDatabase.trainerList.get(0));
            group1.addStudent(StudentDatabase.studentList.get(0));
            group1.addStudent(StudentDatabase.studentList.get(1));
            group1.addStudent(StudentDatabase.studentList.get(2));
            group1.addStudent(StudentDatabase.studentList.get(3));

            Group group2 = new Group();
            group2.setName("Vilniusjava11");
            group2.setTrainer(TrainerDatabase.trainerList.get(1));
            group2.addStudent(StudentDatabase.studentList.get(4));
            group2.addStudent(StudentDatabase.studentList.get(5));
            group2.addStudent(StudentDatabase.studentList.get(6));
            group2.addStudent(StudentDatabase.studentList.get(7));
            group2.addStudent(StudentDatabase.studentList.get(8));

            Group group3 = new Group();
            group3.setName("Vilniusjava12");
            group3.setTrainer(TrainerDatabase.trainerList.get(2));
            group3.addStudent(StudentDatabase.studentList.get(9));
            group3.addStudent(StudentDatabase.studentList.get(10));
            group3.addStudent(StudentDatabase.studentList.get(11));


            Group group4 = new Group();
            group4.setName("Vilniusjava13");
            group4.setTrainer(TrainerDatabase.trainerList.get(1));
            group4.addStudent(StudentDatabase.studentList.get(12));
            group4.addStudent(StudentDatabase.studentList.get(13));
            group4.addStudent(StudentDatabase.studentList.get(14));

            groupList.add(group1);
            groupList.add(group2);
            groupList.add(group3);
            groupList.add(group4);


        } catch (MaximumNumberOfStudentsReached e) {
            System.out.println("Student list is to long");
        }




        }


    }






