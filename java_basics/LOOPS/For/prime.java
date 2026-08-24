import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Num=sc.nextInt();
        int i;
        boolean Prime=false; //just a random variable name
        for(i=2;i<=Num;i++){
            if(Num%i==0){
                Prime=true;
                break;
            }
            
        }
        if(Prime==false){
            System.out.println("Not Prime");
        }
        else {
            System.out.println("Prime");
        }
        
        sc.close();

        
        
        
    
    
    sc.close();
}
    
    
}
