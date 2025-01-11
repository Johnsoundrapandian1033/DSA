package comDSA;

public class Matrix_Target_find {

        public static void main(String[] arg){
            int[][] arr = {{1,3}};
            int num = 3;
            Solution sol = new Solution();
            System.out.println(sol.searchMatrix(arr,num));
        }
    }
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {

            for(int[] row:matrix){
                for(int i : row){
                    if(i==target) return true;
                }
            }
            // for(int i =0; i < matrix.length;i++){
            //     for(int j =0;j<matrix[0].length;j++){
            //         System.out.println(i+"  "+j);
            //         if(matrix[i][j]==target) return true;
            //     }
            // }
            return false;
        }
    }

