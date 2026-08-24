import java.util.*;

public class salary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float basic = sc.nextFloat();
        char grade = sc.next().charAt(0);

        int allowance = (grade == 'A') ? 1700 :
                         (grade == 'B') ? 1500 : 1300;

        float salary = 1.59f * basic + allowance;

        System.out.println(Math.round(salary));
        sc.close();
    }
}