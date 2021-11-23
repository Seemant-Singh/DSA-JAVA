import java.util.Arrays;
import java.util.Scanner;
public class Pract{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr={1,2,3,4,5};
        rotD(arr,n);
        System.out.println(Arrays.toString(arr));
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