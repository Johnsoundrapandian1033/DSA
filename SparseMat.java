import java.util.Scanner;
public class SparseMat
{
    public static void main(String args[])
    {
        int a[][] = new int [3][3];
        int i,j,count = 0;
        System.out.println("enter the elements :");
        Scanner scanner = new Scanner(System.in);
        for(i = 0; i < a.length; i++)
        {
            for(j = 0; j < a.length; j++)
            {
                a[i][j] = scanner.nextInt();
            }
        }
        for(i = 0; i < a.length; i++)
        {
            for(j = 0; j < a.length; j++)
            {
                if(a[i][j] == 0)
                {
                    count += 1;
                }
            }
        }
        if(count >= 4)
        {
            System.out.println("sparse matrix:");
        }
        else
            System.out.println("not sparse matrix");
    }
}
