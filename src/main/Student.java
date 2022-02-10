package src.main;

class Student {
    protected int year;

    public void studentSelectCourse() {
        Select s1 = new Select();
        Course c1 = new Course();
        Student st1 = new Student();
        s1.setMarkAndLocation(123, "phonesavang", "A.JTON", 555);
        c1.setNameCourse("Java oop");
        st1.setYear(2022);
        System.out.println("Your lession is: " + s1.getMark() + " & your locations is: " + s1.getLocation());
        System.out.println("Your name coures is: " + c1.getNameCourse());
        System.out.println("Your version course is: " + st1.getYear());
        System.out.println("Teacher's name is: " + s1.getNameTeacher());
        System.out.print("TeacherId is: ");
        System.out.print(s1.getTecherId());

    }

    public void studentAgePerson(int a) {
        this.year = a;
    }

    public void setYear(int y) {
        this.year = y;
    }

    public int getYear() {
        return this.year;
    }

    public static void main(String[] args) {
        Student info = new Student();
        info.studentSelectCourse();
    }
}