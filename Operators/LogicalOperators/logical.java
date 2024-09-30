//LOGICAL OPERATORS RETURNS A BOOLEAN VALUE JUST LIKE RELATIONAL OPERATORS
import java.util.Scanner;
class Logical{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        float num1 = myObj.nextFloat();
        float num2 = myObj.nextFloat();

        System.out.println(num1>5 && num2<5); //Logical AND(&&)
        System.out.println(num1>5 || num2<5); //Logical OR(||)
        System.out.println(!(num1>5 || num2<5)); //Logical NOT(!)
    }
}