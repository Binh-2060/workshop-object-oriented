import src.main.*;

public class Instructor {
    public void assign() {
        Course c = new Course();
        c.setGradeByTeacher("Java OOP", 12.22, 1222);
        c.setStudentId(1222);
        System.out.println("Your assign is:");
        System.out.println("Name Course: " + c.getNameCourseByTeacher());
        System.out.println("The grade is: " + c.getGradeByTeacher());
        System.out.println("Your student: " + c.getStudentId());
    }

    public void informationPerson() {
        Course c = new Course();
        Select s1 = new Select();
        s1.setMarkAndLocation(123, "phonesavang", "A.JTON", 555);
        c.setGradeByTeacher("Java OOP", 12.22, 1222);
        c.setStudentId(1222);
        System.out.println("Name Course: " + c.getNameCourseByTeacher());
        System.out.println("Your id is: " + c.getStudentId());
        System.out.print("TeacherId is: ");
        System.out.println(s1.getTecherId());
        System.out.println("Teacher's name: " + s1.getNameTeacher());
    }

    public static void main(String[] args) {
        Instructor in = new Instructor();
        in.assign();
    }

}
