//the main concept is modular arithmatic
//ex: 3%6=3,6%6=0,9%6=3
//(i+x)%6 here i is current index where you start and x isno of rotation and 6 is the number of blocks 
//for the right rotation we add and for left we will subtract but negative index will make it difficult so add length of array also
//so the left rotation formmula is (1-x+arraylength)%6
import java.util.*;
public class ArrayRotation {
    public static int[] RotatedArray(int[] A){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nwrite 1 for right rotation and choose 0 for left rotation:");
        int dir=sc.nextInt();
        System.out.print("No of rotations you want:");
        int x=sc.nextInt();
        int[] B=new int[A.length];
        for(int i=0;i<B.length;i++){
            if(dir==0){
                B[(i-x+B.length)%B.length]=A[i];
            }
            else if(dir==1){
                B[i+x]=A[i];
            }
            
        }
        return B;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the Array:");
        int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        int[] Rotation=RotatedArray(A);
        for(int i:Rotation){
            System.out.print(i+" ");

        }
        sc.close();
    }

    
}
