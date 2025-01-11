import java.util.Scanner;
public class MatEqual
{
    public static void main(String args[])
    {
        int a[][] = new int [2][2];
        int b[][] = new int [2][2];
        int i ,j,count = 1;
        System.out.println("enter the elements:");
        Scanner scanner = new Scanner(System.in);
        for(i = 0; i < a.length; i++)
        {
            for(j = 0; j < a.length ; j++)
            {
               a[i][j] = scanner.nextInt();
            }
        }
        for(i = 0; i < b.length; i++)
        {
            for(j =0; j < b.length; j++)
            {
                b[i][j] = scanner.nextInt();
            }
        }
        for(i = 0; i < a.length; i++)
        {
            for(j =0 ; j < a.length; j++)
            {
                if(a[i][j] != b[i][j])
                {
                    count = 0;
                    break;
                }
                else
                    count = 1;
            }
        }
        if (count == 1)
            System.out.println("its equal");
        else
            System.out.println(" not equal");
    }

}
