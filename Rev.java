import java.util.Arrays;
import java.util.Scanner;
public class Rev{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};
        int target=4;
        System.out.println(Arrays.toString(linearsearch(arr,target)));
    }
    static int[] linearsearch(int[] arr,int target){
        if(arr.length==0)
            return new int[]{-1};
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(target==arr[i])
        //         return new int[]{i};
        // }
        for(int element:arr)
        {
            if(target==element)
                return new int[]{element};
        }
        return new int[]{-1};
    }
}