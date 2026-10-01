import java.util.*;
class pusshing_zeroes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Capacity of the array:");
        int len=sc.nextInt();
        int[] A=new int[len];
        for(int i=0;i<A.length;i++){
            System.out.print("enter the value of element at "+i+" index: ");
            A[i]=sc.nextInt();

        }
        pushing(A);
        System.out.println("So your Array with Pushed Zeroes is:");
        System.out.print("[");
        for(int j:A){
            System.out.print(j+" ");
        }
        System.out.println("]");

    }  
    public static void Swap(int[] A,int nz,int z){
        int temp;
        temp=A[z];
        A[z]=A[nz];
        A[nz]=temp;


    }     

    public static void pushing(int[] A){
        int nz=0;
        int z=0;
        while(z<A.length){
            if(A[z]!=0){
                Swap(A,nz,z);
                nz++;
            }
            z++;
        } 
    }
 }