import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort{
    public static void main(String[] args){
        int[] arr={3,1,-5,4,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1])
                    swap(arr,j,j-1);
                else
                    break;
            }       
        }
    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int last=arr.length-1-i;
            int maxpo=maxpos(arr,0,last);
            swap(arr,maxpo,last);
            }
        }
        static void swap(int[] arr,int s,int e){
            int temp=arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
        }
        static int maxpos(int[] arr,int start,int last){
            int max=start;
            for(int i=start;i<=last;i++){
                if(arr[i]>arr[max])
                    max=i;
            }
            return max;
        }
    static void bubble(int[] arr){
        for(int i=0;i<arr.length-1;i++)
        {
            boolean swapped=false;
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
    }
}
