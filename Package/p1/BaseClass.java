package p1;

public class BaseClass {

    int n1 = 1;
    private int n2 = 2;
    protected int n3 = 3;
    public int n4 = 4;

    public BaseClass() {
        System.out.println("Default n1=" + n1);
        System.out.println("Private n2=" + n2);
        System.out.println("Protected n3=" + n3);
        System.out.println("Public n4=" + n4);
    }

}
