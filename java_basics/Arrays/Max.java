import java.util.*;
public class Max {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;//this will assign the loweest value to it
        for(int j:arr){
            if(j>max){
                max=j;
            }
        }
        System.out.println("LARGEST:"+max);
        sc.close();
    }
    
}
