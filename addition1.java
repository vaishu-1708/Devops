import java.util.Scanner;
public class addition1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first number");
        double num1=s.nextDouble();
        System.out.println("enter second number");
        double num2=s.nextDouble();
        double sum=num1+num2;
        System.out.println("the sum of"+num1+"and"+num2+"is"+sum);
        s.close();

    }
}