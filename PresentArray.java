import java.util.Scanner;
public class PresentArray
{
    public static void main(String args[])
    {
       int a[]  = new int [10];
       int n,i,pos =0;
       System.out.println("enter the elements:");
       Scanner scanner = new Scanner(System.in);
       for(i = 0;  i < a.length; i++)
       {
           a[i] = scanner.nextInt();
       }
       System.out.println("enter the search number:");
       n = scanner.nextInt();
       for(i = 0 ; i < a.length; i++)
       {
           if(a[i] ==  n)
           {
               pos = i;
           }
       }
       if(pos > 0)
       {
           System.out.println(pos+1 +"position");
       }
       else
           System.out.println("re entre the number");
    }
}
