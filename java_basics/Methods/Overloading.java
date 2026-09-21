//creating two or more
// methods with same name is called method overloadding
//if you havediffernet number of arguments then you should the numbr of args u want
//if the numbr of args are same there shoudld differnt data types 
//so between 2 rules there should be one satisfy
class Overloading{
    public static void sum(int a,int b){
        System.out.println(a+b);

    }
    public static void sum(int a,int b,int c){
        System.out.println(a+b+c);

    }

    public static void main(String[] args){
        sum(3,2);
        sum(3,5,7);
    }
    
}