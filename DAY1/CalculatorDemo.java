import  java.util.Scanner;
class Calculator{
    double op1,op2;
    
    public  double add(){
        
        return op1+op2;
    }
    public double sub(){
        
        return op1-op2;
    }
    public double mul(){
        
        return op1*op2;
    }
    public double div(){
        if(op2==0){
            System.out.println("Division by Zero Error:");
            return 0;
        }
        return op1/op2;
    }
}


public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator obj= new Calculator();
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("MENU:");
        System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit\nEnter your choice:");
        int choice = sc.nextInt();
        if(choice==5){
            System.out.println("Exiting the calculator.");
            System.exit(0);
        }else if(choice < 1 || choice > 5) {
            System.out.println("Invalid choice, please try again.");
            continue;
        }
        System.out.println("Enter first operand:");
        obj.op1 = sc.nextInt();
         System.out.println("Enter second operand:");
        obj.op2 = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println(obj.add());
                break;
            case 2:
                System.out.println(obj.sub());
                break;
            case 3:
                System.out.println(obj.mul());
                break;
            case 4:
                System.out.println(obj.div());
                break;
        }
    }
    }
}
