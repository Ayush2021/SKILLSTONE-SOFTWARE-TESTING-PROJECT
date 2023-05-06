import java.util.Scanner;
public class MaxThree{
    public static void main(String[] args){
        int n1, n2,n3,largest;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the value of 1");
        n1 = input.nextInt();
        System.out.println("Enter the value of 2");
        n2 = input.nextInt();
        System.out.println("Enter the value of 3");
        n3 = input.nextInt();
        input.close();
        
        if( n1 > n2 && n1 > n3 )
        largest = n1;
        else if( n2 > n1 && n2 > n3 )
        largest = n2;
        else
        largest = n3;
        System.out.printf("%d is maximum", largest);
    }
}