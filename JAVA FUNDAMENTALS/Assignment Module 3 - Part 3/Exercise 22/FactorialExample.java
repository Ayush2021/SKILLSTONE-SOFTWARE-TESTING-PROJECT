import java.util.Scanner;
public class FactorialExample {
    public static void main(String[] args){
        int n, sum=0;
        System.out.println("Enter the Numbers");
        Scanner r = new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.printf("Sum of n number is = %d",sum);
    }
}

