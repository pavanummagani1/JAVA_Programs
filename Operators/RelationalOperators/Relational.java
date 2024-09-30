//RELATIONAL Operators Returns  a boolean value either a TRUE OR FALSE
import java.util.Scanner;
class Relational{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();
        System.out.println(num1 > num2); //GreaterThan
        System.out.println(num1 < num2); //Lessthan
        System.out.println(num1 == num2); //Equal to
        System.out.println(num1 != num2); //Not Equal to
        System.out.println(num1 >= num2); //Greaterthan or equalto
        System.out.println(num1 <= num2); //Lessthan or equal to
    }
}