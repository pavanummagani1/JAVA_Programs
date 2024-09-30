import java.util.Scanner;
class Productoftwonums{
//Function
public static int product(int n1, int n2){
    int Product = n1*n2;
    return Product;
}
//Main
public static void main(String[] args){
    Scanner num = new Scanner(System.in);
    int num1 = num.nextInt();
    int num2 = num.nextInt();
    int result = product(num1,num2);
    System.out.println("The product of num1 and num2 is "+result);
}
}