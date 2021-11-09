import java.util.Scanner;
public class RotationCount{
    public static void main(String[] args){
          int[] arr={5,6,1,2,3,4};
          System.out.println(countrotation(arr));
    }
    static int countrotation(int[] arr){
        int pivot=findpivot(arr);
        return pivot+1;
    }
    static int findpivot(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m<e && arr[m]>arr[m+1])
                return m;
            if(m>s && arr[m]<arr[m-1])
                return m-1;
            if(arr[m]<=arr[s])
                e=m-1;
            else
                s=m+1;
        }
        return -1;
    }
}