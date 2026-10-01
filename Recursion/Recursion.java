import java.util.*;
public class Recursion{

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int smallOutput=fact(n-1);
        int output=n*smallOutput;
        return output;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want for Factorial:");
        int n=sc.nextInt();
        System.out.println(fact(n));
        sc.close();
        
    }
    
}