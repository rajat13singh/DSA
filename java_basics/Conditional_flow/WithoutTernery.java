import java.util.*;
public class WithoutTernery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int greater;//we just created so we can assign greater value to the greater
        if(num1>num2){
            greater=num1;
        }
        else{
            greater=num2;
        }
        System.out.println("the greater number is :" + greater);//we use + here to attch the value of variable with the print
        sc.close();
        }
    }
    

