import java.util.Scanner;
public class FreqMat
{
    public static void main(String args[])
    {
        int a[][] = new int [3][3];
        int i,j,ofreq =0,efreq=0;
        System.out.println("enter the elements :");
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
                if(a[i][j] % 2 == 0)
                {
                    efreq +=1;
                }
                else
                    ofreq +=1;
            }
        }
        System.out.println("even frequency is"+efreq);
        System.out.println("odd frequency is"+ofreq);
    }
}
