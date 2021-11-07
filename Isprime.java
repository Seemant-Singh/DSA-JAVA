import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
public class Isprime{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        // int b=in.nextInt();
        // int c=in.nextInt();
        // System.out.println(factorial(a));
        System.out.println(isprime(a));
    }
    static boolean isprime(int a){
         int c=2;
         if(a<0)
             a=a*-1;
         while(c*c<=a){
             if(a%c==0)
                 return false;
             c++;
         }
         return true;
    }
}