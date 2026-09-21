public class Traversing {
    public static void main(String[] args) {
        int arr[]={1,2,5,6};//second way to assign and create array
        System.out.println(arr.length);
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
            
        }
        for(int j:arr){ //here j:arr means j in arr i.e here j will not a index it is the number itself inside the array
            System.out.print(j+" ");

        }
    }
    
}
