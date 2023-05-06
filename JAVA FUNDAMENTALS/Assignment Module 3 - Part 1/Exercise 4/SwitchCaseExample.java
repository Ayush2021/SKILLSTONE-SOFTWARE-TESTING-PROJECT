import java.util.Scanner;
public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select a letter: R, G, B");
        char letter = input.next().charAt(0);
        switch (letter) {
            case 'R':
                System.out.println("Your favorite color is red");
                break;
            case 'G':
                System.out.println("Your favorite color is green");
                break;
            case 'B':
                System.out.println("Your favorite color is blue");
                break;
            default:
                System.out.println("Invalid selection");
                break;
        }
    }
}