//Write Program that reads marks in maths(M),physics(P) and chemistry(C) and return true if the below conditions are satisfied
//CONDITION-1: M>=35 and P>=35 and C>=35
//CONDITION-2 = M+C>=90 OR P+C>=90 OR C+M>=90
import java.util.Scanner;
class Eligiblity3{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int M = myObj.nextInt();
        int P = myObj.nextInt();
        int C = myObj.nextInt();
        boolean result1 = ((M>=35) && (P>=35) &&(C>=35));
        boolean result2 = ((M+P>=90) || (P+C>=90) || (C+M>=90));
        System.out.println(result1 && result2);
    }
}