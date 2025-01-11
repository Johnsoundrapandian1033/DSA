import java.util.Scanner;
public class SepArray
{
    public static void main(String args[])
    {
        int a[] = new int [10];
        int Odd[]= new int[0];
        int Even[]= new int[0];
        int i,j,odd= 0,even= 0;
        System.out.println("enter the elements :");
        Scanner scanner = new Scanner(System.in);
        for(i = 0; i <a.length; i++)
        {
            a[i] = scanner.nextInt();
        }
        for(i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.println(Even[even]);
            }

        }
        for(i = 0; i < a.length; i++)
        {
            if(a[i] % 2 != 0)
            {
                System.out.println(a[i]);
            }

        }

    }
}
