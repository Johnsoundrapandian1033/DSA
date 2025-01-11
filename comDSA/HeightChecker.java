package comDSA;

public class HeightChecker {
    public static int heightChecker(int[] heights){
        int[] expected =  heights.clone();
        int count = 0;
        for(int i =0; i < heights.length-1;i++){
            for(int j = i+1;j<heights.length;j++){
                if(heights[i]>heights[j]){
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                }
            }
        }
        for( int q =0; q<heights.length;q++){
            System.out.print(heights[q]+" ");
        }
        for( int q =0; q<heights.length;q++){
            System.out.print(expected[q]+" ");
        }
        for(int k =0 ; k < heights.length;k++){
            if(expected[k] != heights[k]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] a = {5,4,3,2,1,0};
        int b = heightChecker(a);
        System.out.println(b);
    }
}
