public class basics {
    public static void main(String[] args) {
        //declarig variable
        int a;
        //declaring array and also have to specify the sie of the array
        //int arr[];
        //int []arr1;
        //int [] arr2;
        //these all three are valid declarations
        int arr[]=new int[10];//default values will be 0 for int ad 0.0 for float and so on
        arr[3]=15;
        System.out.println(arr[3]);
        System.out.println(arr[0]);
        System.out.println(arr[3]-arr[2]);
        for(int i=0;i<=10;i++){
            arr[i]=2;
            System.out.println(arr[i]);
        } 

    }
    
}
