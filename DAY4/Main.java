
// class Display extends Thread {
//     public Display() {
//         this.start();
//     }
//     public void run() {
//         int i = 1;
//         while (i <= 100) {
//             System.out.println("Using While:" + i);
//             i++;
//         }
//     }
// }
class EvenThread extends Thread {

    int n;

    public EvenThread(int n) {
        this.n = n;
        this.start();
    }

    public void run() {
        System.out.println("Even" + n);
    }
}

class OddThread extends Thread {

    int n;

    public OddThread(int n) {
        this.n = n;
        this.start();
    }

    public void run() {
        System.out.println("Odd" + n);
    }
}

public class Main {

    // static void OneToHundredUsingFor() {
    //     for (int i = 1; i <= 100; i++) {
    //         System.out.println("Using For:" + i);
    //     }
    // }
    public static void main(String[] args) {
        // Display d = new Display();
        // d.start();
        // OneToHundredUsingFor();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                EvenThread even = new EvenThread(i);
            } else {
                OddThread odd = new OddThread(i);
            }
        }

    }
}
