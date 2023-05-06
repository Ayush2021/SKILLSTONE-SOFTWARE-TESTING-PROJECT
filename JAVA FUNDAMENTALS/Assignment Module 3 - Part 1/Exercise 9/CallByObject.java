import java.util.Scanner;
public class CallByObject {
    int a, b;

    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CallByObject obj = new CallByObject();
        System.out.println("Enter the values of a and b");
        obj.a = input.nextInt();
        obj.b = input.nextInt();
        obj.swap(obj.a, obj.b);
        System.out.println("After swapping: a = " + obj.a + " b = " + obj.b);
    }
}