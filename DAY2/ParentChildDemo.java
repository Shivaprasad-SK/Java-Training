
class Parent {

    int x;

    public Parent(int x) {
        this.x = x;
    }

    public void display() {
        System.out.println("X:" + x);
    }
}

class Child extends Parent {

    int y;

    // int x = 20;
    public Child(int x, int y) {
        super(x);
        this.y = y;
    }

    public void display() {
        // super.display();
        System.out.println(" Y:" + y);
    }

}

public class ParentChildDemo {

    public static void main(String[] args) {
        // Parent p1 = new Parent(10);
        Child c1 = new Child(10, 20);
        // p1.x = 10;
        // c1.x = 20;
        // p1.display();
        c1.display();
    }
}
