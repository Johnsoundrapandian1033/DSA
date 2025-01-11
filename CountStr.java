import java.util.Scanner;
public class CountStr {
    public static void main(String args[])
    {
        String a ;
        System.out.println("enter the String :");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();

        int i,count = 0,count2 =0;
        for(i = 0; i < a.length(); i++)
        {
            if(a.charAt(i) !=' '){
                count +=  1;
            }
            if(a.charAt(i) == '.' || a.charAt(i) == ',' || a.charAt(i) == ';' || a.charAt(i) == ':' || a.charAt(i) =='?' || a.charAt(i) == '\'' || a.charAt(i) == '\"' || a.charAt(i) == ':') {
                count2 += 1;
            }

        }
        System.out.println(count + " " + count2);
    }
}
