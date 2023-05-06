import java.util.Scanner;
class PassArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter the numbers:");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("Array elements from method:");
    displayArray(a);
  }
  static void displayArray(int[] a) {
    for (int i = 0; i < a.length; i++) {
      System.out.println("a[" + i + "] = " + (a[i] + 1));
    }
  }
}