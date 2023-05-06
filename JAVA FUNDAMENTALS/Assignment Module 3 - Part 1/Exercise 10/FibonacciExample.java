import java.util.Scanner;
public class FibonacciExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = input.nextInt();
        int i = 0, j = 1, k;
        System.out.println(i);
        System.out.println(j);
        int count = 2;
        do {
            k = i + j;
            System.out.println(k);
            i = j;
            j = k;
            count++;
        } while (count < n);
    }
}