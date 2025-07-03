package oop.finalexam.t2;

import java.util.Arrays;
import java.util.List;

public class Student {

    // Default initialization for my name
    String name = "Lasha";
    String lastName = "Ghurtskaia";
    List<Course> courses = Arrays.asList(
            new Course("Mathematics", "None", "Algebra, Geometry"),
            new Course("Physics", "Mathematics", "Mechanics, Optics")
    );

    public Student(String name, String lastName, List<Course> courses) {
        this.name = name;
        this.lastName = lastName;
        this.courses = courses;
    }

    String getName(){
        return this.name;
    }

    String getLastName(){
        return this.lastName;
    }

    List<Course> getCourses(){
        return this.courses;
    }

}
