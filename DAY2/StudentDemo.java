
import java.util.Scanner;

class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void display() {
        System.out.println("Name:" + name + "\nAge:" + age);
    }
}

class Student extends Person {

    String usn;
    int marks;

    public Student(String name, int age, String usn, int marks) {
        super(name, age);
        this.usn = usn;
        this.marks = marks;
    }

    public void display() {
        super.display();
        System.out.println("USN:" + usn + "\nMarks:" + marks);
    }
}

class Teacher extends Person {

    int id;
    int salary;

    public Teacher(String name, int age, int id, int salary) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.out.println("ID:" + id + "\nSalary:" + salary);
    }

}

public class StudentDemo {

    public static Student studentsInfo() {
        String name, usn;
        int age, marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Details:");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("USN: ");
        usn = sc.next();
        System.out.print("Marks: ");
        marks = sc.nextInt();
        sc.nextLine();
        Student s1 = new Student(name, age, usn, marks);
        return s1;

    }

    public static void displayStudents(Student s1) {

        System.out.println("\nStudent Information:");
        s1.display();
    }

    public static void teachersInfo() {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Teacher Details:");
        System.out.print("Name: ");
        String tname = sc.nextLine();
        System.out.print("Age: ");
        int tage = sc.nextInt();
        System.out.print("id: ");
        int id = sc.nextInt();
        System.out.print("Salary: ");
        int salary = sc.nextInt();
        System.out.println("\nTeacher Information:");
        Teacher t1 = new Teacher(tname, tage, id, salary);
        t1.display();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            int ch;
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    Student s1 = studentsInfo();
                    break;
                case 2:
                    // displayStudents();
                    break;
                default:
                    throw new AssertionError();
            }

        }

    }
}
