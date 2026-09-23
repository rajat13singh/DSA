import java.util.*;
public class Update {
    public static int takeInput(String str){
        Scanner sc=new Scanner(System.in);
        System.out.println(str);
        int input=sc.nextInt();
        return input;
        
    
}
public static void updated(int A[],int key,int newkey){
    for(int i=0;i<A.length;i++){
        if(A[i]==key){
            A[i]=newkey;
            return;
        }
    }
    System.out.println("Key is not found.");
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int cap=takeInput("enter the capacity of the Array:");
    int A[]=new int[cap];
    for(int i=0;i<cap;i++){
        A[i]=takeInput("enter the element at "+i+" index");
    }
    int key=takeInput("enter the key:");
    int newKey=takeInput("enter the new key:");
    updated(A,key,newKey);
    System.out.println("updated array is :");
    for(int i:A){
        System.out.print(i+" ");
    }

}
}

