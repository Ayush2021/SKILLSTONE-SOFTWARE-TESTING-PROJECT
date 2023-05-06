import java.util.Scanner;
public class CallByValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        System.out.println("Before calling method x=" + x + " y=" + y);
        swap(x, y);
        System.out.println("After calling method x=" + x + " y=" + y);
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("From method x=" + a + " y=" + b);
    }
}