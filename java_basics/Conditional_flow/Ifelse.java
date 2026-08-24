import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //if(condition){}
        if(num%2==0){
            System.out.println("its a even number");

        }
        else{
            System.out.println("outside if");

        }
        
        sc.close();
    }
    
}
