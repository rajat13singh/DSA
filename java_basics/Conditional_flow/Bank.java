import java.util.*;
public class Bank{
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    float salary = sc.nextFloat();
    boolean has_loans = sc.nextBoolean();
    if (age >= 18 && salary >=2000 && !has_loans) {
        System.out.println("You are eligible for the loan.");
    } else {
        System.out.println("You are not eligible for the loan.");
}
    sc.close();
}
}