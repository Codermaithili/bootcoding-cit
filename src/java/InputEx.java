import java.util.Scanner;

public class InputEx{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int n = sc.nextInt();
        System.out.println("enter second number");
        int m = sc.nextInt();
        int add = n+m;
        System.out.println("Addition =" + add);
        int sub = n-m;
        System.out.println("Subtraction =" + sub);
        int multi = n*m;
        System.out.println("Multiplication =" + multi);
        int div = n/m;
        System.out.println("Division =" + div);
    }
}
