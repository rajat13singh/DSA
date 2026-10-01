import java.util.*;
public class Removeduplicates {
    
        //here we dont knw what will be the size of the result array so we will use ArrayList
        public static ArrayList<Integer>removeconsecutiveDuplicates(int arr[]){ //here we consider the return type ArrayList
            ArrayList<Integer> result=new ArrayList<>();
            result.add(arr[0]);
            for(int i=1;i<arr.length;i++){
                if(arr[i]!=arr[i-1]){
                    result.add(arr[i]);

                }
              
                }
            return result; 

            }
        
        public static void main(String[] args) {
            int arr[]={10,10,20,2020,30,30,40};
            ArrayList<Integer>result=removeconsecutiveDuplicates(arr);
            for(int i:result){
                System.out.print(i+" ");
            }

        }
    }
    

