import java.util.*; //this is exit control loop and others are entry control loop
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int randomNumber=random.nextInt(10);
        int guessNumber; //here the execution will done first and then the condition will be checked
        //so even if the condition is false from the first time the body will execute atleast one time
        do{
            System.out.print("Enter the number between 1-10:");
            guessNumber=sc.nextInt();
        }while(guessNumber!=randomNumber);
        sc.close();
    
    }

    
}
