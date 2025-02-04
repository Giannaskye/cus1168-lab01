package academy.javapro;

import java.util.*;
import java.util.stream.*;

public class StudentStreamLab {
    public static void main(String[] args) {
        // Creating a list of students
        List<Student> students = Arrays.asList(
                new Student("Alice", 3.5, "Junior"),
                new Student("Bob", 3.8, "Senior"),
                new Student("Charlie", 2.9, "Sophomore"),
                new Student("David", 3.1, "Freshman"),
                new Student("Eve", 3.9, "Junior")
        );

        // TODO - Filtering: Students with GPA > 3.0
        List<student> highGpaStudents = studens.stream()
        .filter(student -> student.getGpa() > 3.0)
                .collect(Collectors.toList());
        System.out.println("Students with GPA > 3.0:");
        highGpaStudents.forEach(s -> System.out.println(s.getName()));

        // TODO - Mapping: Extract names of students with GPA > 3.0
 List<String> highGpaStudentNames = students.stream()
                .filter(student -> student.getGpa() > 3.0)
                .map(Student::getName)
                .collect(Collectors.toList());
 System.out.println("\nNames of students with GPA > 3.0:");
        highGpaStudentNames.forEach(System.out::println);

        // TODO - Reducing: Calculate the average GPA of all students
double averageGpa = students.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0.0);

        System.out.println("\nAverage GPA: " + averageGpa);
        // TODO Collecting: Collect all "Junior" students into a list
        List<Student> juniorStudents = students.stream()
                .filter(student -> "Junior".equals(student.getYear()))
                .collect(Collectors.toList());

        System.out.println("\nJunior students:");
        juniorStudents.forEach(s -> System.out.println(s.getName()));
    }
    }
