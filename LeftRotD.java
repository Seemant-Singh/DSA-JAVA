import java.util.Arrays;
import java.util.Scanner;
public class LeftRotD{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int d=sc.nextInt();
        int[] arr={1,2,3,4,5};
        leftrotD(arr,d);
        System.out.println(Arrays.toString(arr));
    }
    static void leftrotD(int[] arr,int d){
        int n=arr.length;
        rotate(arr,0,d-1);
        rotate(arr,d,n-1);
        rotate(arr,0,n-1);
    }
    static void rotate(int[] arr,int low,int high){
        int s=low;
        int e=high;
        while(s<e){
            swap(arr,s,e);
            s++;
            e--;
        }
    }
    static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    static void rotD(int[] arr,int n){

        int count=0;
        while(count<n){
            int temp=arr[0];
            for(int i=1;i<arr.length;i++)
                arr[i-1]=arr[i];
            arr[arr.length-1]=temp;
            count++;
        }
    }
}