public class Sum {
    public static int Sumn(int n){
        if(n==0){
            return 0;
        }
        int smalloutput=Sumn(n-1);
        int output=n+smalloutput;
        return output;

    }
    public static void main(String[] args) {
        System.out.println(Sumn(10));
        
    }
    
}
