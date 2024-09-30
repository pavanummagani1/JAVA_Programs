//CLASS AND OBJECT MAIN WITHIN THE CLASS
import java.util.Scanner;
class Calculator1{
    Scanner num = new Scanner(System.in);
    int num1 = num.nextInt();
    int num2 = num.nextInt();
    public static void main(String[] args){
        Calculator1 add = new Calculator1();
        int Sum = add.num1+add.num2; //num1 and num2 are declared outside main method and got through object destructuring
        int Product = add.num1*add.num2;
        int Difference = add.num1-add.num2;
        int Divide = add.num1/add.num2;
        System.out.println("The Sum  of Num1 and Num2 is "+Sum);
        System.out.println("The Product  of Num1 and Num2 is "+Product);
        System.out.println("The Difference  of Num1 and Num2 is "+Difference);
        System.out.println("The Quotient  of Num1 and Num2 is "+Divide);
    }
}