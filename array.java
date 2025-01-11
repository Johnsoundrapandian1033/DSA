
import java.util.Arrays;
class salary{
    int s = 10000;
}
class bonus extends salary {
    int b = 1000;
}
class total extends bonus{
    int t = b+s;
    public static void main (String args[]){
            total p = new total();
            System.out.println(p.b);
            System.out.println(p.s);
            System.out.println(p.t);
    }
}
