import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter he value of n:");        int N=sc.nextInt();
        int Sum=0;
        int i;
        for(i=1;i<=N;i++){
            Sum=Sum+i;
        }
        System.out.println("SO THE SUM OF THE N NUMBERS IS="+(Sum));
        sc.close();
        }
    
    
}
