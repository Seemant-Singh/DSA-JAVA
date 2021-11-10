import java.util.Arrays;
import java.util.Scanner;
public class SearchTwoDArrayOlogn{
    public static void main(String[] args){
          int[][] arr={
              {1,2,3,4},
              {5,6,7,8},
              {9,10,11,12},
              {13,14,15,16}
          };
          int target=16;
          int[] ans=search(arr,target);
          System.out.println(Arrays.toString(ans));
    }
    static int[] binary(int[][] arr,int row,int cstr,int cend,int target){
        while(cstr<=cend)
        {
            int mid=cstr+(cend-cstr)/2;
            if(arr[row][mid]==target)
                return new int[]{row,mid};
            if(arr[row][mid]<target)
                cstr=mid+1;
            else
                cend=mid-1;
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] arr,int target){
        int row=arr.length;
        int col=arr[0].length;
        if(row==1)
            return binary(arr,0,0,col-1,target);
        int rstr=0;
        int rend=row-1;
        int cmid=(col)/2;
        while(rstr<(rend-1))
        {
            int mid=rstr+(rend-rstr)/2;
            if(arr[mid][cmid]==target)
                return new int[]{mid,cmid};
            if(arr[mid][cmid]<target)
                rstr=mid;
            else    
                rend=mid;
        }
        if(arr[rstr][cmid]==target)
            return new int[]{rstr,cmid};
        if(arr[rstr+1][cmid]==target)
            return new int[]{rstr+1,cmid};
        if(target<=arr[rstr][cmid-1])
            return binary(arr,rstr,0,cmid-1,target);
        if(target>=arr[rstr][cmid+1] && target<=arr[rstr][col-1])
            return binary(arr,rstr,cmid+1,col-1,target);
        if(target<=arr[rstr+1][cmid-1])
            return binary(arr,rstr+1,0,cmid-1,target);
        else
            return binary(arr,rstr+1,cmid+1,col-1,target);
    }
    // static int[] Search(int[][] arr,int target){
    //     int row=0;
    //     int col=arr.length-1;
    //     while(row<arr.length && col>=0)
    //     {
    //         if(target==arr[row][col])
    //             return new int[]{row,col};
    //         if(target>arr[row][col])
    //             row++;
    //         else
    //             col--;
    //     }
    //     return new int[]{-1,-1};
    // }
}