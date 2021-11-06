import java.util.Arrays;
import java.util.Scanner;
public class TwodArray{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};
        int[][] a={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // String str="kunal";
        int target=3;
        int s=0,e=4;
        System.out.println(Arrays.toString(linearsearch(arr,target,s,e)));
        System.out.println(max(arr,s,e));
        System.out.println(Arrays.toString(search(a,target)));
    }
    static int[] search(int[][] arr,int target){
        if(arr.length==0)
            return new int[]{-1,-1};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(target==arr[i][j])
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    static int[] linearsearch(int[] arr,int target,int s,int e){
        if(arr.length==0)
            return new int[]{-1};
 
        for(int i=s;i<=e && i<arr.length-1;i++)
        {
            if(target==arr[i])
                return new int[]{i};
        }
        return new int[]{-1};
    }
    static int max(int[] arr,int s,int e){
        int max=Integer.MIN_VALUE;
        for(int i=s;i<=e;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}