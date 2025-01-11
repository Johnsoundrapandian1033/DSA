import java.util.Scanner;
public class polindrome {
    public static void main(String args[]){
        int n,i,j,poly =0,rem,count =1;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for(j =1; j < n; j++)
        {
            rem = j;
            for(i = 1;rem > 0; i++)
            {
                 count = j%10;
                poly = (poly*10)+ count;
                rem = rem /10;

            }
            if (poly ==  j)
            {
                System.out.println(j);
            }
        }


    }
}
