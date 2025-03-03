package BytesPart1.Task4;

public class Student {
    String grade;
    String studentId;

    public Student(String grade, String studentId) {
        this.grade = grade;
        this.studentId = studentId;
    }

    public String getGrade() {
        return grade;
    }

    public String getId() {
        return studentId;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade='" + grade + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
