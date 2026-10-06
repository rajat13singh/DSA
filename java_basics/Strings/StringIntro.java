import java.util.*;
public class StringIntro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Input=sc.nextLine();
        System.out.println(Input.toUpperCase());
        //for the index value of the string wwe will use method charAt
        System.out.println(Input.charAt(3));
        //Using new Keyword
        //passing string literal
        String str=new String("Coding");
        //passing character array
        char ch[]={'a','b','c','d'};
        String str2=new String(ch);
        //passsing the byte array
        byte b[]={97,98,99,100,101};
        String str3=new String(b);
        
        
    }
    
    
}
