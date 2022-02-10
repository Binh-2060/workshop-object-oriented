package src.main;

public class Course {
    protected String name;
    protected double grade;
    protected int studentId;
    protected int courseId;

    public void setNameCourse(String n) {
        this.name = n;
    }

    public String getNameCourse() {
        return this.name;
    }

    public void setGrade(double g) {
        this.grade = g;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGradeByTeacher(String n, double g, int c) {
        this.name = n;
        this.grade = g;
        this.courseId = c;
    }

    public String getNameCourseByTeacher() {
        return this.name;
    }

    public double getGradeByTeacher() {
        return this.grade;
    }

    public void setStudentId(int id) {
        this.studentId = id;
    }

    public int getStudentId() {
        return this.studentId;
    }
}
