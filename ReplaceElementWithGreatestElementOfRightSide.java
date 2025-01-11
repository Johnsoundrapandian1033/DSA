package comDSA;

public class ReplaceElementWithGreatestElementOfRightSide {
    public static void main(String args[]){
        int[] a = new int[]{18,3,6,4,8,2,7,4,1};
        int[] b = new int[a.length];
        System.out.println("hi");
         b = replace(a);
         for(int i = 0;i<b.length;i++){
             System.out.println(b[i]);
         }
    }
    public static int[] replace(int[] s){
       /* System.out.println("hello");
        int i = 0;
        int n = s.length;
        int max;
        while(i < n-1){
            s[i] =s[i+1];
            max =s[i];
            for(int j =i+1;j<n;j++){
                if(s[j]>max){
                    max = s[j];

                }
            }
            s[i] = max;
            i++;
        }
        s[n-1] =-1;*/
        int n = s.length;
        int maxRight = -1;
        for(int i = n-1;i >=0;i-- ){
            int temp = s[i];
            s[i] = maxRight;
            maxRight =Math.max(maxRight,temp);
        }
        return s;
    }
}
