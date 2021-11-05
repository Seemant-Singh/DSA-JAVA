import java.util.Scanner;
import java.util.Arrays;
public class first{
    public static void main(String[] args){
        int[][] arr={{23,4,1},{18,12,3,9},{78,99,34,56},{18,12}};
        int target=34;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr,int target){
        if(arr.length==0)
            return new int[]{-1,-1};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }    
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int[] element : arr){
            for(int a: element){
                if(a>max)
                    max=a;
            }
        }
        return max;
    }
}