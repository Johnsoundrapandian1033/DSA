/*package comDSA;
import java.util.*;
public class Recursion_Atoi {

        int atoi(String s) {

            s=s.trim();
            int val =0;
            int count =0;
            if(s.charAt(0)=='-') count = 1;
            if(count==1) val = check(s,1);
            else val=check(s,0);
            if(val==-1) return -1;
            else if(val!=-1 && count==1){
                return val*(-1);
            }
            return count==1?val*(-1):val;
        }
        int sum =0;
        int check(String str,int i){

            if(str.charAt(i)>='0'&& str.charAt(i)<='9' ){
                sum=sum*10+(str.charAt(i)-'0');

            }
            else{
                sum=-1;
                return sum;
            }

            if(i==str.length()-1) return sum;
            else check(str,++i);
            return sum;
        }


}
*/