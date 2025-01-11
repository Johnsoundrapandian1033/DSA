import java.util.Scanner;
public class SumRowCol
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
            sum =0;
            for(j =0; j < a.length; j++)
            {
                sum += a[i][j];
            }
            System.out.println(i + 1 +"row is"+ sum);
        }
        for(i = 0; i < a.length; i++)
        {
            sum =0;
            for(j =0; j < a.length; j++)
            {
                sum += a[j][i];
            }
            System.out.println(i + 1 +"column is"+ sum);
        }
    }
}
