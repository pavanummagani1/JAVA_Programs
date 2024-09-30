import java.util.Scanner;
class Arithmetic{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();
        int addition = num1+num2;
        int subtraction = num1-num2;
        int product = num1*num2;
        int divide = num1/num2;
        int remainder = num1%num2;
        int preincrement = ++num1; //First Increment and then fetch the value
        int postincrement = num1++; //first fetch the value then increment ==> num = num+1
        int predecrement = --num1;
        int postdecrement = num1--;
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(product);
        System.out.println(divide);
        System.out.println(remainder);
        System.out.println(preincrement);
        System.out.println(postincrement);
        System.out.println(predecrement);
        System.out.println(postdecrement);
    }
}