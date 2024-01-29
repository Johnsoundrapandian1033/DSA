import java.util.Scanner;
public class Avoid0AndSort {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n1 = scanner.nextInt();
            int[] a = new int[n1];
            System.out.println("Enter the 1st array elements :");
            for(int i = 0 ; i < n1; i++)
            {
                a[i] = scanner.nextInt();
            }
            for(int i = 0; i < a.length; i++)
            {
                for(int k =i+1; k < a.length; k++)
                {
                    int temp = a[i];
                    a[i] =a[k];
                    a[k] =temp;
                }
            }
            int n2 = scanner.nextInt();
            int[] b = new int[n2];
            System.out.println("Enter the 2nd array elements :");
            for(int i = 0 ; i < n2; i++)
            {
                b[i] = scanner.nextInt();
            }
            for(int i = 0; i < b.length; i++)
            {
                for(int k =i+1; k < b.length; k++)
                {
                    int temp = b[i];
                    b[i] =b[k];
                    b[k] =temp;
                }
            }
            int size = a.length + b.length;
            int[] c  = new int[size ];
            int j =0;
            for(int i =0 ; i < a.length; i++)
            {
                c[i] = a[i];
                j++;
            }

            for(int i =0 ; i < b.length; i++)
            {
                c[j] = b[i];
                j++;
            }
            int l = 0;
            for(int k =0 ; k < 1 ; k++)
            {
                for(int i = 0; i < c.length; i++)
                {
                    if(c[i] ==0)
                    {
                        //c[i] = c[i+1];
                        size--;
                    }
                    else
                    {
                        c[l] = c[i];
                        System.out.print(c[l]+"  ");
                        l++;
                    }
                }
                for(int  h=0; h<size; h++)
                {
                    for(int m =h+1; m < size; m++)
                    {
                        if(c[h] > c[m])
                        {
                            int temp = c[h];
                            c[h] = c[m];
                            c[m] = temp;
                        }
                    }
                }
                System.out.println("after sorting");
            }
            for(int n = 0; n < size ; n++)
            {
                System.out.print(c[n]+"  ");
            }
    }
}
