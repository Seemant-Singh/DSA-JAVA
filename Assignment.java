import java.util.Arrays;
import java.util.Scanner;
public class Assignment{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        // int n=in.nextInt();
        int start=in.nextInt();
        int end=in.nextInt();
        for(int i=start;i<=end;i++)
        {
            if(isprime(i))
                System.out.println(i);
        }
        // System.out.println(sum(n)); 
        // System.out.println(palindrome(n));                
    }
    static boolean palindrome(int n){
        int target=n;
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans*10+rem;
            n/=10;
        }
        return ans==target;
    }
    static int sum(int n){
        int sum=0;
        int i=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        return sum;
    }
    static boolean isprime(int n){
        int c=2;
        while(c*c<=n){
            if(n%c==0)
                return false;
            c++;
        }
        return true;
    }
}