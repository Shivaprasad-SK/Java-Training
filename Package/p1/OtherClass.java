
package p1;

public class OtherClass {

    public OtherClass() {
        p1.BaseClass b = new p1.BaseClass();
        System.out.println("Default n1=" + b.n1);
        // System.out.println("Private n2=" + b.n2);
        System.out.println("Protected n3=" + b.n3);
        System.out.println("Public n4=" + b.n4);
    }

}
