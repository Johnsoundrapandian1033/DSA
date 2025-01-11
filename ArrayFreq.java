import java.util.Scanner;
public class ArrayFreq {
    public static void main (String args[]){
        int a[] = new int[10];
        int i,j,count =0;
        System.out.println("enter the elements :");
        Scanner scanner = new Scanner (System.in);
        for(i= 0; i < a.length; i++)
        {
            a[i]= scanner.nextInt();
        }
        for(i = 0; i < a.length; i++)
        {
            count = 1;
            for(j =i + 1; j < a.length; j++)
            {

                if(a[i] == a[j])
                {
                    count += 1;
                }
            }
            System.out.println(a[i]+"\t"+count);
        }
    }
}
