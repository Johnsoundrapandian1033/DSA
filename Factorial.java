public class Factorial
{
    static int fact(int i)
    {
        int sum;
        if (i == 1) {
            return 1;
        } else {
            return i * fact(i - 1);
        }
    }

        public static void main (String []args)
        {
            int a = 5;
            int b;
            System.out.println(fact(a));

        }

}

