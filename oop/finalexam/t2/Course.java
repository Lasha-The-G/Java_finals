package oop.finalexam.t2;

public class Course {
    private String title;
    private String prerequisites;
    private String majorTopics;

    public Course(String title, String prerequisites, String majorTopics) {
        this.title = title;
        this.prerequisites = prerequisites;
        this.majorTopics = majorTopics;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrerequisites() {
        return prerequisites;
    }
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getMajorTopics() {
        return majorTopics;
    }
    public void setMajorTopics(String majorTopics) {
        this.majorTopics = majorTopics;
    }
}


