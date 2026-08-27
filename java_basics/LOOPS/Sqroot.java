import java.util.*;
public class Sqroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long i = 0;

        while ((i + 1) * (i + 1) <= N) {
            i++;
        }

        System.out.println(i);

        sc.close();
    }
}