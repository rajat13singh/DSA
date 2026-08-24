import java.util.*;
public class First4Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1,j=4;i<=50 && j>0;i++){
            if(i%2==0){
                System.out.println(i);
                j--;
        }
    }
    sc.close();
}
    
}
