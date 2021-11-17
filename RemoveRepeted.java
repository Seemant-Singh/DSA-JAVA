import java.util.Arrays;
import java.util.Scanner;
public class trail{
    public static void main(String[] args){
          int[] arr={2,2,5,5,6,6,10,10};
          System.out.println(searchkareasy(arr));
          System.out.println(Arrays.toString(arr));
    }
    static int searchkareasy(int[] arr){
        int res=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]!=arr[i])
                {
                    arr[res]=arr[i];
                    res++;
                }
        }
        return res;
    }
    static int search(int[] arr){
        int n=arr.length;
        int[] temp=new int[n];
        int res=1;
        temp[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]!=arr[i])
                {
                    temp[res]=arr[i];
                    res++;
                }
        }
        return count(temp,res);
    }
    static int count(int[] arr,int res){
        int cnt=0;
        for(int i=0;i<res;i++)
        {
            cnt++;
        }
        return cnt;
    }
}