import java.util.Scanner;
class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//this the the line which will took input#sc
        float totalMarks=sc.nextFloat();//sc is just the object name
        int scored=sc.nextInt();
        double percentage=(scored/totalMarks)*100;
        System.out.println(percentage);
        //if we dont want any user input just close the work
        sc.close();
    }

    
}
