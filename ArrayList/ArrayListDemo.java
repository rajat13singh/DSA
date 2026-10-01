import java.util.ArrayList;
public class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(/*here we can enter the size but defailt size is 10 */);
        arr.add(4);//add at index 0
        arr.add(56);
        arr.add(80);
        arr.add(1,45);//add 45 at index 1 and all will shift right
        System.out.println(arr.size());//tells the current size of the array
        System.out.println(arr.get(1));//tells the elemnt at indext 1
        arr.remove(1);
        //for removing the value we have set
        arr.set(2,100);//at index 2 we are replacing elemnt with 100
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        
    }
}