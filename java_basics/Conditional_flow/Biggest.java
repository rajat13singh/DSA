import java.util.*;
public class Biggest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF NUM1:");
        int num1=sc.nextInt();
        System.out.println("ENTER THE VALUE OF NUM2:");
        int num2=sc.nextInt();
        System.out.println("ENTER THE VALUE OF NUM3:");
        int num3=sc.nextInt();
        int biggest=num1>num2? (num1>num3? num1:num3):(num2>num3? num2:num3);
        System.out.println("SO THE BIGGEST NUMBER AMONG THE THREE IS "+biggest);
        sc.close();
    }

}  
    

