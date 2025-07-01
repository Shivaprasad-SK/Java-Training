
class Point {

    private int x, y;

    public Point() {
        this.x = 1;
        this.y = 1;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("(" + x + "," + y + ")");
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public Point add(Point p) {
        Point point = new Point();
        point.x = this.x + p.y;
        point.y = this.y + p.y;
        return point;
    }
}

public class pointDemo {

    public static void main(String[] args) {
        Point pt = new Point(10, 20);
        Point p2 = new Point(15, 10);
        // pt.x = 10;
        // pt.y = 20;
        pt.display();
        // String name = "Shivaprasad K";
        // System.out.println(pt);
        // System.out.println(p2);
        // pt.move(5, 5);

        pt.display();
        Point p3 = p2.add(pt);
        p3.display();
    }
}
