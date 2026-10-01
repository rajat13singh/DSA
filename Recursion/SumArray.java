import java.util.*;
public class SumArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of the array:");
        int n=sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<input.length;i++){
            input[i]=sc.nextInt();
        }
        int SumOfN=sum(input);
        System.out.println("So the sum of the elemnts of the array is:");
        System.out.println(SumOfN);
        sc.close();
        
    }

    public static int sum(int input[]) {
        return sumArray(input, 0);
    }

    public static int sumArray(int input[], int i) {

        // Base case
        if (i == input.length) {
            return 0;
        }

        // Recursive case
        return input[i] + sumArray(input, i + 1);
    }
}