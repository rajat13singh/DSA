import java.util.*;
public class Studentuse {
    public static void main(String[] args){
        Student s1=new Student();/*this is constructor Student and should be same as class */
        Student s2=new Student();//so this is the way to create object here s1 and s2 are object
        //this object have properties of the class
        //s1 and s2 are references adress of the objects stores 
        System.out.println(s1);//the default value of string is null and integer is 0
        s1.name="Rajat";
        s2.age=20;
        System.out.println(s1.name+" "+s1.age); 
    }
    class Student{
        String name;
        int age;
    }
    
}
