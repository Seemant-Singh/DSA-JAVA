import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int[] arr={1,3,23,9,18,50};
        String str="hello";
        char aim='k';
        int target =18;
        System.out.println(rsearch(arr,target,1,3));
        System.out.println(search(str,aim));
        System.out.println(lsearch(arr,target));

    }
    static int rsearch(int[] arr,int target,int s,int e){
        if(arr.length==0)
            return -1;
        for(int i=s;i<=e;i++)
        {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    static int lsearch(int[] arr,int target)
    {
        if(arr.length==0)
            return -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    static boolean search(String str,char aim){
        if(str.length()==0)
            return false;
        for(char element:str.toCharArray()){
            if(element==aim)
                return true;
        }
        return false;
    }
}


 