//Write Program that reads marks in maths(M),physics(P) and chemistry(C) and return true if any of the below conditions are satisfied
//CONDITION-1: M>=60 and P>=50 and C>=45 and M+P+C>=180
//CONDITION-2 = M+P>=120 or C+P>=110
import java.util.Scanner;
class Eligiblity4{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int M = myObj.nextInt();
        int P = myObj.nextInt();
        int C = myObj.nextInt();
        boolean result1 = ((M>=60)&&(P>=50)&&(C>=45))&&((M+P+C)>=180);
        boolean result2 = ((M+P>=120) || (C+P>=110));
        System.out.println(result1 ||  result2);
    }
}
//72 65 51 ==> TRUE
//70 0 70  ==> FALSE
//60 60 40 ==> TRUE