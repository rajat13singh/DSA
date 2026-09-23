import java.util.*;
class Insertion{
    public static int takeInput(String str){
        Scanner sc=new Scanner(System.in);
        System.out.println(str);
        int input=sc.nextInt();
        return input;
    }
    public static int insert(int A[],int pos,int ele,int size){
        for(int i=size;i>pos;i--){
            A[i]=A[i-1];

        }
        A[pos]=ele;
        size++;
        return size;

    }    
    public static void main(String[] args) {
         int cap=takeInput("enter the capacity of the array:");
         int size=takeInput("enter the size of the Array:");
         int A[]=new int[cap];
         for(int i=0;i<size;i++){ //size because we want only the number we have
            A[i]=takeInput("enter the element at "+i+" index:");
         }
         int ele=takeInput("enter the element to be inserted");
         int pos=takeInput("enter the position at which the element should be inserted");
         size=insert(A,pos,ele,size);
         for(int i:A){
            System.out.print(i+" ");
         }
        
    }


}