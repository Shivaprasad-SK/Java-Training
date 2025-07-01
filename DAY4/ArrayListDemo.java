
import java.util.ArrayList;

class Student {

    int usn;
    String name;
    float marks;

    public Student(int usn, String name, float marks) {
        this.usn = usn;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("USN: " + usn + ", Name: " + name + ", Marks: " + marks);
    }
}

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(1, "Shiva", 85.5f));
        al.add(new Student(2, "Prasad", 90f));
        al.add(new Student(3, "SPK", 95f));
        System.out.println("Lengtgh " + al.size());
        // al.add("Sunday");
        // System.out.println("Lengtgh " + al.size());
        // al.add("Monday");
        // System.out.println("Lengtgh " + al.size());
        // al.add("Tuesday");
        // System.out.println("Lengtgh " + al.size());
        // al.add("Wednesday");
        // System.out.println("Lengtgh " + al.size());
        Student temp = null;
        for (Student st : al) {
            if (st.usn == 3) {
                temp = st;
                break;

            }
        }
        al.remove(temp);
        System.out.println("Lengtgh " + al.size());
        // al.remove("Monday");
        // System.out.println("Lengtgh " + al.size());
        // System.out.println("1: " + al.get(0));
    }
}
