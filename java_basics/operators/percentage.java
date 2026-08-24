public class percentage {
    public static void main(String[] args){
        int TotalMarks=800;
        int Scored=540;
        //percentage
        double percentage=(double)((double)(Scored)/(TotalMarks))*100;//herer we need to convert the int to double first as otherwise thde putput will be zero as intergr division
        System.out.println(percentage);
    }
}
    

