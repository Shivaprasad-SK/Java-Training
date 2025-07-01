
interface Calc {

    abstract public double add(double op1, double op2);

    abstract public double sub(double op1, double op2);

    abstract public double mul(double op1, double op2);

    abstract public double div(double op1, double op2);
}

class MyCal implements Calc {

    public double add(double op1, double op2) {
        return op1 + op2;
    }

    public double sub(double op1, double op2) {
        return op1 - op2;
    }

    public double mul(double op1, double op2) {
        return op1 * op2;
    }

    public double div(double op1, double op2) {
        return op1 / op2;
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {
        Calc mc = new MyCal();
        System.out.println("Addition:" + mc.add(10, 20));
        System.out.println("Substraction:" + mc.sub(10, 20));
        System.out.println("Multiplication:" + mc.mul(10, 20));
        System.out.println("Division:" + mc.div(10, 20));

    }
}
