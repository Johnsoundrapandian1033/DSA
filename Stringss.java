import java.util.Scanner;
public class Stringss {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String a ="john soundra pandian";
        int len = a.length();
        char[] b= a.toCharArray();
        for(int i = 0; i < len; i++){
            System.out.println(b[i]);
        }
        char c = scanner.next().charAt(0);
        for(int i = 0; i < len; i++){
            if(b[i] == c) {
                System.out.println("position"+i+1);
            }
        }

    }
}
