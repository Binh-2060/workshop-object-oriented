
public class Person {
    protected String name;
    protected int age;

    void setAgeAndName(int a, String n) {
        this.age = a;
        this.name = n;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    void printInformation() {
        Instructor in = new Instructor();
        Person p = new Person();
        p.setAgeAndName(18, "Saysana");
        System.out.println("Your name is: " + p.getName());
        System.out.println("Your age is: " + p.getAge());
        in.informationPerson();

    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.printInformation();
    }
}
