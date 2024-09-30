//CLASS AND OBJECT MAIN OUTSIDE THE CLASS
import java.util.Scanner;
class Calculator2{
    public int add(int n1,int n2){
        int Sum_result = n1+n2;
        return Sum_result;
    }
    public int product(int n1,int n2){
        int Product_result = n1*n2;
        return Product_result;
    }
}
class Calculator{
public static void main(String[] args){
    Scanner num = new Scanner(System.in);
    int num1 = num.nextInt();
    int num2 = num.nextInt();
    Calculator2 calc = new Calculator2();
    int Sum_result = calc.add(num1,num2);
    int Product_result = calc.product(num1,num2);
    System.out.println(Sum_result);
    System.out.println(Product_result);
}
}