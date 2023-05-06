import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int result = 0;
        int n = 0;
        for (; num != 0; n++) {
            num /= 10;
        }
        num = originalNum;
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            result += Math.pow(digit, n);
        }
        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}