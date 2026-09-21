/*we have to print ABCD
                   BCDE
                   CDEF
                   DEFG */
import java.util.*;
public class pattern2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            char p=(char)('A'+i+1);
            for(int j=1;j<=n;j++){
                char jthChar=(char)('A'+i-1);
                System.out.print(jthChar);
                System.out.print(p);

            }    
            }
            System.out.println();
            sc.close();
        }
    
}

