import java.io.PrintStream;
import java.util.Scanner;
import java.util.Arrays;

public class AnagramStr {
    public static void main(String args[]) {
        String a;
        String b;
        System.out.println("enter the string1 :");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();
        System.out.println("enter the string2 :");
        b = scanner.nextLine();
        if (a == b) {
            System.out.println(" both are equal :");
        }
        if (a.length() != b.length()) {
            System.out.println("not equal :");
        } else {

            char[] c = a.toCharArray();
            char[] d = b.toCharArray();

            Arrays.sort(c);
            //arraySort(c, c.length);

            //PrintStream obj = System.out;
            //obj.println("Hello World");

            System.out.println("sort after" + c);


            Arrays.sort(d);
            System.out.println("sort after" + d);
            if (Arrays.equals(c, d) == true) {
                System.out.println(" both are equal :");
            } else
                System.out.println(" not equal");
        }
    }

    static void arraySort(char c[], int len) {

        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] > c[j]) {
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
    }


}