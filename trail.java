import java.util.Arrays;
import java.util.Scanner;
public class trail{
    public static void main(String[] args){
          int[] arr={2,5,6,1,10};
          System.out.println(search(arr));
    }
    static int search(int[] arr){
        int res=-1,max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[max])
            {
                res=max;
                max=i;
            }
            else if(arr[i]!=arr[max])
            {
                if(res==-1||arr[i]>arr[res])
                    res=i;
            }
        }
        return res;
    }
}