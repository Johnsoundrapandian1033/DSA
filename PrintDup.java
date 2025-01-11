import java.util.Scanner;
public class PrintDup 
{
    public static void main (String args[]) {
        int a[] = new int[10];
        int i, j, count = 0;
        int b[] = new int[0];
        System.out.println(" enter the elements :");
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[j]);
                }
            }
        }
    }
}
