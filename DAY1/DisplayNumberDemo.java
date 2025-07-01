
class DislayNumbers {

    void displayUsingForLoop() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    void displayUsingWhile() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    void displayUsingdoWhile() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    void displayUsingRecursion(int a) {
        System.out.println(a);
        if (a >= 10) {
            return;
        }
        displayUsingRecursion(a + 1);
    }
}

public class DisplayNumberDemo {

    public static void main(String[] args) {
        DislayNumbers obj = new DislayNumbers();
        System.out.println("Display Using For Loop:");
        obj.displayUsingForLoop();
        System.out.println("Display Using For While Loop:");
        obj.displayUsingWhile();
        System.out.println("Display Using For Do While Loop:");
        obj.displayUsingdoWhile();
        System.out.println("Display Using For Recursion:");
        obj.displayUsingRecursion(1);
    }
}
