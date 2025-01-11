import java.util.Scanner;
public class LargeNo
{
    public static void main(String args[])
    {
        int a[] = new int [10];
        int i , max = 0;
        System.out.println("enter the elements:");
        Scanner scanner = new Scanner(System.in);
        for(i = 0; i < a.length; i++)
        {
            a[i] = scanner.nextInt();
        }
        max= a[0];
        for(i = 0; i < a.length; i++)
        {
            if(a[i] < max)
            {
                max =  a[i];
            }
        }
        System.out.println(max);
    }
}
