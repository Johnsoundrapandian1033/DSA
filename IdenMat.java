import java.util.Scanner;
public class IdenMat
{
    public static void main(String args[])
    {
        int a[][] = new int [3][3];
        int i,j,count = 0;
        System.out.println(" enter the elements :");
        Scanner scanner = new Scanner(System.in);

        for(i = 0; i < a.length; i++)
        {
            for(j =0; j < a.length; j++)
            {
               a[i][j] = scanner.nextInt();
            }
        }
        for(i = 0; i < a.length; i++)
        {
            for(j =0; j < a.length; j++)
            {
                if((i == j && a[i][j] != 1) || (i != j && a[i][j] != 0))
                {
                    count = 0;

                }
                else
                    count = 1;
            }
            if(count == 0)
                break;
        }
        if(count == 1)
            System.out.println("Idetity Matrix");
        else
            System.out.println(" not Identity Matrix");
    }
}
