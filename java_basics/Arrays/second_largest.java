import java.util.*;
public class second_largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int largest=arr[0];
        int secondlargest=0;
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int j:arr){
            if(j>largest){
                secondlargest=largest;
                largest=j;

            }
        }
        System.out.println(secondlargest);
        sc.close();

    }
    
}
