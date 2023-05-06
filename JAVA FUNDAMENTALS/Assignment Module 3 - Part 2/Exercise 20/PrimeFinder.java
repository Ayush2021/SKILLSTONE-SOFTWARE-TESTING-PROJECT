import java.util.Scanner;
class PrimeFinder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    boolean isPrime = true;
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }
    if (isPrime) {
      System.out.println("The given number is prime.");
    } else {
      System.out.println("The given number is not prime.");
    }
  }
}