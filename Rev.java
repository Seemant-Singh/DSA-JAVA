import java.util.Arrays;
import java.util.Scanner;
public class Rev{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};
        // String str="kunal";
        int target=3;
        int s=0,e=4;
        System.out.println(Arrays.toString(linearsearch(arr,target,s,e)));
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
}