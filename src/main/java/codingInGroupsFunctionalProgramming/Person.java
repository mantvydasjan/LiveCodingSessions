package codingInGroupsFunctionalProgramming;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data @AllArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

}
