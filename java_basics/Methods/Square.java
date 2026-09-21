import java.util.*;
public class Square {
    public static int Square(int a){ //void means we are not returning anything nut we want to return so write there return type
        int sq=a*a;
        return(sq);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int sqr=Square(n); //we created a variable becoz return wwill store anywhere
        System.out.print(sqr);
        System.out.println();
        sc.close();
}
}
