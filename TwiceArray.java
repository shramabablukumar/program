import java.util.*;
public class TwiceArray{
    public static boolean Maxvalue(int arr[]){
        int count = 0;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                count ++;
            }
            if(count>=2){
                return true;
            }

        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {1,1,1,3,3,4,3,2,4,2};
       System.out.println( Maxvalue(arr));
    }
}