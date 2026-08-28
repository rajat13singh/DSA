public class basics {
    public static void main(String[] args) {
        int i;
        int j;
        for(i=1;i<=5;i++){//pattern 1
            for(j=1;j<=5;j++){
                System.out.print(i);
            }
            System.out.println();

        }
        System.out.println(); //pattern 2
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println(); //pattern 3
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                System.out.print(5-j+1); //5 is the input from the user 
            }
            System.out.println();
    }
    
    
}
}