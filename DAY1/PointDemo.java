

class Point{
    private  int a;
    private  int b;
    public void setA(int a){
        this.a=a;
    }
    public int getA(){
        return this.a;
    }
    public void setB(int i){
        this.b=i;
    }
    public int getB(){
        return this.b;
    }
}
public class PointDemo {
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        Point pt=new Point();
        pt.setA(1);
        pt.setB(2);
        System.out.println("("+pt.getA()+","+pt.getB()+")");
    }
}
