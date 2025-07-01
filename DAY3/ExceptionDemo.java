
class A {

    public A() throws Exception {
        // try {
        //     System.out.println("Inside a try block");

        // } catch (Exception e) {
        //     System.out.println("Inside a catch block");
        // } finally {
        //     System.out.println("Inside a Finally block");
        // }
        // System.out.println("Outside try catch finally");
        int x = 10, y = 0;
        int z = x / y;
    }
}

class B {

    public B() {
        try {
            System.out.println("Inside a try block");
            int x = 10, y = 0;
            // int z = x / y;
            if (y == 0) {
                throw new Exception("An exception occurred");
            }
        } catch (Exception e) {
            System.out.println("Inside a catch block");
        } finally {
            System.out.println("Inside a Finally block");
        }
        System.out.println("Outside try catch finally");
    }
}

class C {

    public C() {
        try {
            System.out.println("Inside a try block");
            return;
        } catch (Exception e) {
            System.out.println("Inside a catch block");
        } finally {
            System.out.println("Inside a Finally block");
        }
        System.out.println("Outside try catch finally");
    }
}

public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            new A();
        } catch (Exception e) {
            System.out.println("Inside a catch block");
        }

    }
}
