import java.util.Scanner;
public class LowTriMat
{
    public static void main(String args[])
    {
        int a[][] = new int[3][3];
        int i ,j;
        System.out.println("enter the elements :");
        Scanner scanner = new Scanner(System.in);
        for(i =0; i < a.length; i++)
        {

            for(j = 0; j < a.length; j++)
            {
                a[i][j]= scanner.nextInt();
            }
        }
        for(i =0; i < a.length; i++)
        {
            System.out.println();
            for(j =0; j < a.length; j++)
            {
                if(i > j)
                {
                    System.out.print("0" + " ");
                }
                else
                    System.out.print(a[i][j]+" ");
            }
        }
    }
}
