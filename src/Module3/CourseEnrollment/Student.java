package Module3.CourseEnrollment;

import java.io.Serializable;

public class Student implements Serializable {
    private int studentID;
    private String name;
    private int age;

    public Student() {
        studentID = 0;
        name = "";
        age = 0;
    }

    public Student(int studentID, String name, int age) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "\nID: " + studentID + "\nName: "+ name + "\nAge: " + age;
    }
}
