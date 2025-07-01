
class A {

    public A() {
        System.out.println("Constructor A is Executed");

    }
}

class B extends A {

    public B() {
        System.out.println("Constructor B is Executed");

    }
}

class C extends B {

    public C() {
        System.out.println("Constructor C is Executed");

    }
}

public class ConstructorDemo {

    public static void main(String[] args) {
        C c = new C();
        int x = 10;
        int y = 0;
        try {
            int z = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Error" + e);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}
