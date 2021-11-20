import java.util.Arrays;
import java.util.Scanner;
public class LeftRot{
    public static void main(String[] args){
          int[] arr={1,2,3,4,5};
          leftR(arr);
          System.out.println(Arrays.toString(arr));
    }
    static void leftR(int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
    static void movezeros(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,i,count);
                count++;
            }
        }
    }
    static void swap(int[] arr,int i,int cnt){
        int temp=arr[i];
        arr[i]=arr[cnt];
        arr[cnt]=temp;
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