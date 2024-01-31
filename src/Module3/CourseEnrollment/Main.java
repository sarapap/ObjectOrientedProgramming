package Module3.CourseEnrollment;

import java.io.*;
public class Main {
    private final static String FILENAME = "enrollments.ser";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student(1, "Sara", 22);
        Course course = new Course("TXK24", "Math", "Math's Teacher");
        Enrollment enrollment = new Enrollment(student, course, "1.2.2024");

        serializeToFile(enrollment);
        System.out.println(deserializeFromFile());
    }

    private static void serializeToFile(Enrollment enrollment) {
        try (
                FileOutputStream outputStream = new FileOutputStream(FILENAME);
                ObjectOutputStream objects = new ObjectOutputStream(outputStream);
        ) {
            objects.writeObject(enrollment);
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }
    }

    private static Enrollment deserializeFromFile() {
        Enrollment enrollment = null;
        try (
                FileInputStream inputStream = new FileInputStream(FILENAME);
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        ) {
            enrollment = (Enrollment) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization failed: " + e.getMessage());
        }
        return enrollment;
    }}

