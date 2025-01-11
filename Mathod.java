class result{
    public int add(int w,int z){
        return w+z;
    }
}
public class Mathod {
    public static void main(String args[])
    {
        int a = 10;
        int b = 22;
        result r = new result();
       int c= r.add(a,b);
       System.out.println(c);
    }
}
