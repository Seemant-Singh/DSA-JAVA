import java.util.Arrays;
import java.util.Scanner;
public class SearchTwoDArray{
    public static void main(String[] args){
          int[][] arr={
              {10,20,30,40},
              {15,25,35,45},
              {28,29,37,49},
              {33,34,38,59}
          };
          int target=38;
          int[] ans=Search(arr,target);
          System.out.println(Arrays.toString(ans));
    }
    static int[] Search(int[][] arr,int target){
        int row=0;
        int col=arr.length-1;
        while(row<arr.length && col>=0)
        {
            if(target==arr[row][col])
                return new int[]{row,col};
            if(target>arr[row][col])
                row++;
            else
                col--;
        }
        return new int[]{-1,-1};
    }
}