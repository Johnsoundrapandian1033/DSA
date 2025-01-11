import java.util.Scanner;
public class strong
{
    static int armst(int b)
    {
        int i,j, c, sum = 1,sum1 = 0;
        c = b;
        for (i = 0; c > 0; i++)
        {
            sum = 1;
            int remain = c % 10;
            for(j = remain; j >0 ; j--)
            {
               sum *= j;
            }
            System.out.println(sum);
            sum1+= sum;

            c = c/ 10;

        }
        System.out.println("total is "+sum1);
        return sum1;
    }
    public static void main(String args[])
    {
        int n,a;
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a= armst(n);
        if (a == n)
            System.out.println(" armstrong number");
        else
            System.out.println("not  amstrong number");
    }

}
