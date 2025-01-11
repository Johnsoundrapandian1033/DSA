import java.util.Scanner;
public class removeDup {
    public static void main (String args[]){
        int a[]= new int [10];
        int b[];
        System.out.println("enter the elements :");
        Scanner scanner = new Scanner(System.in);
        int i ,j,length;
        for(i = 0; i < a.length; i++)
        {
            a[i] = scanner.nextInt();
        }
        length = a.length;
        for(i = 0; i < length;i++)
        {
            for(j = i + 1; j < length; j++)
            {
                if(a[i] == a[j])
                {
                   for(int k = j; k < length-1; i++)
                   {
                       a[k] = a[k+1];
                   }
                   length--;
                   j--;

                }
            }
        }
        for(i = 0 ; i < length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
