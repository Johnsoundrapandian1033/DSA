import java.util.Scanner;
import java.util.*;
public class arrayCopy {
    public static void main(String args[]){
        int a[]=new int[10];
        int b[]= new int[a.length];
        int i;
        System.out.println("enter the elements");
        Scanner scanner = new Scanner(System.in);
        for(i = 0; i < a.length; i++)
        {
            a[i] = scanner.nextInt();
        }
        for(i = 0; i < a.length; i++)
        {
           b[i] = a[i];
        }
        for(i = 0; i < a.length; i++)
        {
           System.out.println(b[i]);
        }

    }
}
