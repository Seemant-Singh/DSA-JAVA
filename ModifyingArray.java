import java.util.Scanner;
public class ModifyingArray{
    public static void main(String[] args){
        //   modifying ARRAY PROBLEM IMPORTANT.
        int[] arr={-5,1,5,0,-7};
        // int max=Integer.MIN_VALUE;
        int max=Math.max(0,arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            arr[i]+=arr[i-1];
            max=Math.max(arr[i],max);
        }
        System.out.println(max);
    }
}