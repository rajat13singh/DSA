import java.util.Scanner;
public class Scholarship{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How much Marks did you score in the Exam??");
        int ExamScore=sc.nextInt();
        System.out.println("How much cgpa did you score in the last sem?");
        float gpa=sc.nextFloat();
        System.out.println("How many stars you have in the sports?"); 
        int sis=sc.nextInt();
        if(ExamScore>=65){
            if(gpa>=3.5||sis>=3){//sis is stars in sports ,only one should true,//we can directly use the && to check marks also here>>
                System.out.println("ELIGIBLE FOR THE SCHOLARSHIP");
        }
            else{
                System.out.println("NOT ELIGIBLE FOR THE SCHOLARSHIP");
            }
        sc.close();
        }
        else{
            System.out.println("NOT ELIGIBLE FOR THE SCHOLARSHIP");
        }
     
}
}
