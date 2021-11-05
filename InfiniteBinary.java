import java.util.Arrays;
import java.util.Scanner;
public class InfiniteBinary{
    public static void main(String[] args){
        int[] arr={3,5,7,9,10,90,100,130,140,160,180,140,240,340,440,550,650,770,800,850,860,890,900};
        int target=130;
        System.out.println(ans(arr,target));       
    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end])
        {
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr,int target,int s,int e){
        // int s=0;
        // int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(target<arr[m])
                e=m-1;
            else if(target>arr[m])
                s=m+1;
            else
                return m;
        }
        return -1;
    }
}