package comDSA;

public class mountainArray {
    public  static void main (String args[]){
       int[] num =new int[]{0,1,2,3,4,5,6,7,8,9};
       boolean s = main(num);
       System.out.println(s);
    }
    public static boolean main(int[] a){
            int i = 0;
            int n = a.length;
            while(i+1< n && a[i] < a[i+1]  ){
                i++;
           }
            if(i==0 || i==n-1){
                return false;
            }
            while(i+1<n && a[i] > a[i+1]  ){
                i++;
            }
            System.out.println(i);
            return i == n-1;
    }
}
