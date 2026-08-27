import java.util.*;

public class Nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int num = 2; num <= N; num++) {

            boolean isPrime = true;

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}