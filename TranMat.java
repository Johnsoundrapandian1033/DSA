import java.util.Scanner;
public class TranMat
{
    public static void main(String args[])
    {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        size = scanner.nextInt();
        int a[][] = new int[size][size];
        int i , j,sum = 0;
        for(i = 0; i < a.length; i++)
        {
            for(j =0; j < a.length; j++)
            {
                a[i][j] = scanner.nextInt();
            }
        }
        for(i = 0; i < a.length; i++)
        {
            System.out.println();
            for(j =0; j < a.length; j++)
            {
                System.out.print(a[j][i] + " ");
            }
        }

    }
}
