//Write a program that takes a number as input and prints all its factors except 1 and the number itself.. If the number has only two factors (1 and the number itself), then the program should print -1.
import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<n;i++){
			if(n%i==0){
			    System.out.print(i+" ");
			}
		    else if(i==1|| i==n){
			    System.out.print(-1);
			    break;
		}
		}
        sc.close();
    }
}