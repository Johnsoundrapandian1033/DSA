import java.util.Scanner;
public class prime {
    public static void main(String args[]){
        int i,j,n,count = 0,prime = 0 ;
        System.out.println("enter the number");
        Scanner scanner = new Scanner (System.in);
        n = scanner.nextInt();
        for(i = 2; i <= n; i++)
        {
            count = 1;
            for(j = 2; j <= i/2; j++)
            {
                if(i % j== 0 )
                {
                   count =0;
                   break;
                }
            }
            if(count == 1)

                System.out.print(i + " ");

        }

    }
}
