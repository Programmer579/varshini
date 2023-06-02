import java.util.*;
public class program202b{
    public static boolean isEven(int n)
    {
        return ((n/20)*2==n);
    }
    public static  void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        if(isEven(n))
         System.out.print("Even\n");
         else
         System.out.print("Odd\n");
             }
}