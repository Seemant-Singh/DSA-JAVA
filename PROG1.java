import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
public class PROG1{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        // int b=in.nextInt();
        // int c=in.nextInt();
        System.out.println(factorial(a));
        // System.out.println(isprime(c));
        // System.out.println(multi(a,b));
    }
    static int factorial(int a){
        int s=1;
        int n=1;
        if(a==0){
            return 1;
        }
        while(n<=a){
            s=s*n;
            n++;
        }
        return s;
    }
//     static boolean isprime(int a){
//         int c=2;
//         if(a<0)
//             a=a*-1;
//         while(c*c<=a){
//             if(a%c==0)
//                 return false;
//             c++;
//         }
//         return true;
//     }
//     static int multi(int a,int b){
//         return a*b;
//     }
//     static int sum(int a,int b){
//         return a+b;
//     }
//     static String even(int a){
//         if(a%2==0){
//             return  "is even";
//         }
//         else{
//             return  "is odd";
//         }
//     }
//     static int max(int a,int b,int c){
//         int mx=a;
//         if(mx<b)
//             mx=b;
//         if(mx<c)
//             mx=c;
//         return mx;
//     }
//     static int min(int a,int b,int c){
//         return Math.min(a,Math.min(b,c));
//     }
}