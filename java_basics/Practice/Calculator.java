import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Choose:\n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.REMAINDER");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first number:");
        int num1=sc.nextInt();
        System.out.println("enter your second number");
        int num2=sc.nextInt();
        System.out.println("what you want to do the from above:");
        int WhatYouNeed=sc.nextInt();
        switch(WhatYouNeed){
            case 1:{
                System.out.println("SUM="+(num1+num2));
                break;
            }
            case 2:{
                System.out.println("DIFF="+(num1-num2));
                break;
            }
            case 3:{
                System.out.println("MULTIPLY="+(num1*num2));
                break;
            }
            case 4:{
                System.out.println("DIVISION="+(num1/num2));
                break;
            }
            case 5:{
                System.out.println("REMAINDER="+(num1%num2));
                break;
            }
        }
        sc.close();
    }
    
}
