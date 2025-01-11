import java.util.Scanner;
public class arrayRotate {
    public static void main(String args[]){
        int a[]=new int[10];
        int i,n,j;
        System.out.println("enter the elements");
        Scanner scanner = new Scanner(System.in);
        for(i = 0; i < a.length; i++)
        {
            a[i] = scanner.nextInt();
        }
        System.out.println("enter the numbers :");
        n = scanner.nextInt();
        for(i = 1; i <= n; i++)
        {
            int last = a[a.length-1];
            for(j =a.length-1; j > 0; j--)
            {
               a[j] = a[j-1];
            }
            a[j] = last;
        }
        System.out.println();
        for(i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
