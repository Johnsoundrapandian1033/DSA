package comDSA;

class IfNandItsDoubleExist{
    public static void main(String[] args) {
        int[] a = {-2,0,10,-19,4,6,-8};
        //method m= new mathod();
        //int a =10;
        boolean flag = checkIfExist(a);
        //for(int i =0 ; i < a.length;i++){
            System.out.println(flag);
        }
    public static boolean checkIfExist(int[] arr) {
        boolean flag = false;
        int value;
        for(int i =0;i < arr.length;i++)
        {
            int p=0;
            value = arr[i]/2;
            if(value == 0){
                p = i+1;
            }
            for( int j =p;j < arr.length;j++)
            {
                if(arr[i] %2 == 0 && arr[j] == value)
                {
                    flag = true;
                    break;
                }
                 /*else if(arr[i] %2 == 0 && Math.abs(arr[j]) == value)
                {
                          flag = true;
                          break;
                }*/
                else
                {
                    flag = false;
                }
            }
            if(flag == true)
            {
                break;
            }
        }
        return flag;
    }




}