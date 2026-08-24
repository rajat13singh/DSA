import java.util.*;
public class PrintIndividual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int last_digit;
        while(num!=0){
            last_digit=num%10;
            System.out.println(last_digit);
            num=num/10;
        }
        sc.close();
    }
    
}
