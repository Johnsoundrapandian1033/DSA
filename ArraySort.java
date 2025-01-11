import java.util.Scanner;
public class ArraySort
{
    public static void main (String args[])
    {
        int a[] = new int [10];
        int i,j;
        System.out.print("enter the number :");
        Scanner scanner = new Scanner (System.in);
        for(i = 0; i < a.length; i++)
        {
            a[i]= scanner.nextInt();
        }
        for(i = 0; i < a.length; i++)
        {
            for(j = i+1; j < a.length; j++)
            {
                if(a[i] < a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }

}
