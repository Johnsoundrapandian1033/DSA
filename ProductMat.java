import java.util.Scanner;
public class ProductMat
{
    public static void main(String args[])
    {
        int a[][] = new int [3][3];
        int b[][] = new int [3][3];
        int c[][] = new int [3][3];
        int i,j;

        System.out.println("enter the array A elements :");
        Scanner scanner = new Scanner(System.in);
        for(i = 0; i < a.length; i++)
        {
            for(j = 0; j < a.length; j++)
            {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("enter the array B elements :");
        for(i = 0; i < b.length; i++)
        {
            for(j = 0; j < b.length; j++)
            {
                b[i][j] = scanner.nextInt();
            }
        }
        System.out.println("finally product element :");
        for(i = 0; i < a.length; i++)
        {

            for(j = 0; j < b.length; j++)
            {
                for(int k =0; k < b.length; k++)
                {
                    c[i][j] += a[i][k]*b[k][j];

                }

            }
        }
        for(i =0; i < c.length;i++)
        {
            System.out.println();
            for(j = 0; j < c.length; j++)
            {
                System.out.print(c[i][j] + " ");
            }
        }
    }
}
