import java.util.*;
public class PositiveCheck{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMEBER:");
        float num=sc.nextFloat();
        if(num>=0 && num%2==0){
            System.out.println("POSOTIVE EVEN");
        }
        else if(num<0 && num%2==0){
            System.out.println("NEGATIVE EVEN");
        }
        else if(num>=0 && num%2!=0){
            System.out.println("POSOTIVE ODD");
        }
        else if(num<0 && num%2!=0){
            System.out.println("NEGATIVE ODD");    
        }  
        else if(num==0){
            System.out.println("ZERO");
        }
        else{
            System.out.println("INVALID!");
        }  
         sc.close();    
    }
    }
