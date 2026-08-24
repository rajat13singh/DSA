import java.util.*;

public class Rev {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rev = 0;

        if (n == 0) {
            System.out.print(0);
        } else {
            while (n != 0) {
                int digit = n % 10;
                rev = rev * 10 + digit;
                n = n / 10;
            }

            System.out.print(rev);
        }

        sc.close();
    }
}