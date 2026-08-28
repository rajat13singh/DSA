//Given a binary number as an integer N, convert it into decimal and print.


import java.util.*;

public class Binary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int decimal = 0;
        int power = 1;

        while (n > 0) {
            int digit = n % 10;

            decimal = decimal + digit * power;

            power = power * 2;

            n = n / 10;
        }

        System.out.println(decimal);

        sc.close();
    }
}