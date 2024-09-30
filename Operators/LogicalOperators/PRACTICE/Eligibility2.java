//Write Program that reads marks in maths(M),physics(P) and chemistry(C) and return true if the below conditions are satisfied
//CONDITION-1: M+P+C>=180
//CONDITION-2 = M+C>=100 OR P+C>=100 OR C+M>=100
import java.util.Scanner;
class Eligiblity2{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int M = myObj.nextInt();
        int P = myObj.nextInt();
        int C = myObj.nextInt();
        boolean result1 = M+P+C>=180;
        boolean result2 = ((M+P>=100) || (P+C>=100) || (C+M>=100));
        System.out.println(result1 && result2);
    }
}