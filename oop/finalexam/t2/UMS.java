package oop.finalexam.t2;

import java.util.List;

public class UMS {
    List<Student> students;

    public void printStudentData(Student student) {
        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Last Name: " + student.getLastName());

        List<Course> courses = student.getCourses();
        if (courses == null || courses.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            System.out.println("Courses:");
            for (Course course : courses) {
                System.out.println("Title: " + course.getTitle());
                System.out.println("Prerequisites: " + course.getPrerequisites());
                System.out.println("Major Topics: " + course.getMajorTopics());
            }
        }
    }
}
