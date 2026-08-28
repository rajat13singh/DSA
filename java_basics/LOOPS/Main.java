import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        int i = 1;

        while (count < n) {

            int series = 3 * i + 2;

            if (series % 4 != 0) {
                System.out.print(series + " ");
                count++;
            }

            i++;
        }

        sc.close();
    }
}