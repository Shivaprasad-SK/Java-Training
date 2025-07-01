
class StaticDemo {

    static int x;

    public StaticDemo() {
        x++;
        System.out.println("X:" + x);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new StaticDemo();
        }

    }
}
