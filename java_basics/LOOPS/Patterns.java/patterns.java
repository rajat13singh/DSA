import java.util.*;
public class patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){ //pattern 1
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
//pattern can be done using while also
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(j);
                j=j+1;
            }
        System.out.println();
        i=i+1;
        }
        

        sc.close();
    }
    
}
