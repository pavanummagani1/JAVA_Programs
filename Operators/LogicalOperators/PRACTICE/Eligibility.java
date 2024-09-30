//Write Program that reads marks in maths(M),physics(P) and chemistry(C) and return true if the below conditions are satisfied
//CONDITION-1: M+P+C>=180
//CONDITION-2 = M>=70 OR P>=60 OR C>=60
import java.util.Scanner;
class Eligiblity1{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int M = myObj.nextInt();
        int P = myObj.nextInt();
        int C = myObj.nextInt();
        boolean result1 = ((M+P+C)>=180);
        boolean result2 = ((M>=70) || (P>=60) || (C>=60));
        System.out.println(result1 && result2);
    }
}