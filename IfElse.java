import java.util.Scanner;
public class IfElse {
    public static void main(String args[]){
        int n1 = 0;
        int n2 = 1;
        int n3;
        int n;
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int i;
        System.out.print(n1+" " +n2);
        for(i = 0; i < n;i++)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " +n3);
        }
    }
}
