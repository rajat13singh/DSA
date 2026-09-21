import java.util.*;
public class Sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            System.out.print("\nEnter the value for the index:"+i+"\n");
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("\nSo the sum of the numbers is:"+sum);
        sc.close();
        
    }
}