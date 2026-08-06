import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner d=new Scanner(System.in);
        System.out.println("Enter 1st number");
        double a=d.nextDouble();
        System.out.println("Enter 2nd number");
        double b=d.nextDouble();
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
        d.close();
    }
}