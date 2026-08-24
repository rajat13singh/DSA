import java.util.*;
public class WithTernary{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int greater=num1>num2? num1:num2; //this is how we use ternary here ? and : both are ternary operator components
        System.out.println("the greater number is :" + greater);//we use + here to attch the value of variable with the print
        sc.close();
        }
    }
    
