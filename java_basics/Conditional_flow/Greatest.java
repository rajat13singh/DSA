public class Greatest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 25;
        int num3 = 18;

        int greatest = (num1 > num2)? (num1 > num3 ? num1 : num3): (num2 > num3 ? num2 : num3);

        System.out.println("Greatest = " + greatest);
    }
}
    
