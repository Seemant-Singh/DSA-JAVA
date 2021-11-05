import java.util.Arrays;
import java.util.Scanner;
public class Binary{
    public static void main(String[] args){
        int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target=6;
        System.out.println(binary(arr,target));
    }
    static int binary(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        boolean isAsc=arr[s]<arr[e];
        while(s<=e){
            int m=s+(e-s)/2;
            // boolean isAsc=arr[s]<arr[e];
            if(target==arr[m])
                return m;
            if(isAsc){
                if(target>arr[m]){s=m+1;}
                else{e=m-1;}
            }
            else{
                if(target>arr[m]){e=m-1;}
                else {s=m+1;}
            }

        }
        return s;
    }
}