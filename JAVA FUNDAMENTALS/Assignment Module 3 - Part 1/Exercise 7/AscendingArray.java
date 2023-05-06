import java.util.Scanner;
class AscendingArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the array size: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter the number to perform function:");
    System.out.println("1 --> ascending");
    System.out.println("2 --> descending");
    int choice = sc.nextInt();

    if (choice == 1) {
      sortAscending(arr);
      System.out.println("Ascending order is:");
      for (int i = 0; i < n; i++) {
        System.out.println(arr[i]);
      }
    } else if (choice == 2) {
      sortDescending(arr);
      System.out.println("Descending order is:");
      for (int i = 0; i < n; i++) {
        System.out.println(arr[i]);
      }
    } else {
      System.out.println("Invalid choice!");
    }
  }

  public static void sortAscending(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void sortDescending(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] < arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
}