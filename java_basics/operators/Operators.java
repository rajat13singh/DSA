public class Operators {
    public static void main(String[] args){
        int i=100;
        int j=i;
        int k=i=10000;//it will update the i also that is it means it will run all the line at once not one by one
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        /*Arithmatic Operators (+,-,*,/,%) */
        System.out.println(100+100);
        System.out.println(100-50);
        System.out.println(100*3);
        System.out.println(100/4);
        System.out.println(100%4);
        //Augmented assignment
        int num=3;
        num=num+3;
        num+=4;
        System.out.println(num);
    }
}
