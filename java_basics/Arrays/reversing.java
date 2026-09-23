//with two arrays
import java.util.*;
public class reversing {
    public static void main(String[] args) {
        
    
     Scanner sc=new Scanner(System.in);
     int[] A=new int[6];
     int[] B=new int[6];
     int j=B.length-1;
     for(int i=0;i<A.length;i++){
        System.out.print("enter the element at "+i+" index:");
        A[i]=sc.nextInt();
        }


        
     for(int i=0;i<A.length;i++){
        
           B[j]=A[i];
           j--;
           
     }
     System.out.println("this is the array A:");
     for(int i:A){
        System.out.print(i+" ");
     }
     System.out.println("this is the array B:");
     for(int K:B){
        System.out.print(K+" ");
     }
     sc.close();
    }


    
}
