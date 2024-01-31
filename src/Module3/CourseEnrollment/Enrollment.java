package Module3.CourseEnrollment;

import java.io.Serializable;

public class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public String toString() {
        return "Enrollment Date: " + enrollmentDate + "\n" + student + "\n" + course;
    }
}
