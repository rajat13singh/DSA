import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //if(condition){}
        if(num%2==0){
            System.out.println("its a even number");

        }
        System.out.println("outside if");
        sc.close();
    }
    
}
