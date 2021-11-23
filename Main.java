import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // System.out.println("hello world");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        int b=1;
        int c=0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(c<=n)
        {
            c=a+b;
            if(c<=n)
                System.out.print(c+" ");
            else
                break;
            a=b;
            b=c;
        }
    }
}
