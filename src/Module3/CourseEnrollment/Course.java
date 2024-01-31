package Module3.CourseEnrollment;

import java.io.Serializable;

public class Course implements Serializable {
    private String courseCode;
    private String courseName;
    private String instructor;

    public Course(String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String toString() {
        return "\nCourse code: " + courseCode + "\nCourse name: " + courseName + "\nInstructor: " + instructor;
    }
}
