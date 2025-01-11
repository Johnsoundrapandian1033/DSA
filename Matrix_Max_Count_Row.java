package comDSA;

public class Matrix_Max_Count_Row {

        public int[] findMaxRow(int mat[][], int N) {
            int count =0 , mid =0,val= 0;
            int[] arr = new int[2];
            for(int i =0 ; i < mat.length;i++){
                count =0;
                val = Math.max(val,binary(mat[i],count));
                if(arr[1]!=val){
                    arr[0]=i;
                    arr[1]=val;
                }
            }

            return arr;
        }
        static int binary(int a[],int c){
            int i = 0,j = a.length-1,mid=0;

            while(i<=j){
                mid = i+(j-i)/2;
                if(a[mid]==1){
                    c = a.length-mid;
                    j=mid-1;
                }
                else
                    i = mid+1;
            }
            return c;
        }

}
