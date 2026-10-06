public class CharacterArray{
    public static void main(String[] args) {
        char ch[]={'a','b','c'};//initializing character array
        char ch2[]=new char[5];//decclaring with size of the array
        System.out.println(ch);//it will not give the adress like others infact it will give the values which are stored in it
        System.out.println(ch.toString());//it will give the adress int terms of [c which shows character address
        //inbuilt methods for the character are :- javap java.lang.Character
        for(int i=0;i<ch.length;i++){
            ch[i]=Character.toUpperCase(ch[i]);
        }
        System.out.println(ch);
        
    }
    
 

}