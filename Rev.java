import java.util.Arrays;
import java.util.Scanner;
public class Rev{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        // int[] arr={1,2,3,4,5,6,7};
        String str="kunal";
        char target='u';
        System.out.println(linearsearch(str,target));
    }
    static boolean linearsearch(String str,char target){
        if(str.length()==0)
            return false;
 
        for(char element:str.toCharArray())
        {
            if(target==element)
                return true;
        }
        return false;
    }
}