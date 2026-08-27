import java.util.*;
public class Nested {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean IsPrime=false;
        for(int n=2;n<=50;n++){
            
            for (int i =0;i<n;i++){
            if(n%i==0){
                IsPrime=false;
                break;
            }
        }
        if(IsPrime){
            System.out.println(n);
        }else{
            System.out.println("Not Prime");

        }
    
    }
    
    }
}
