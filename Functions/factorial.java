import java.util.Scanner;
class Factorial{
    //function
    public static int factorial(int N){
        if(N<0){
            System.out.println("Invalid Number");
            return -1;
        }

        int Product = 1;
        for( int i=1;i<=N;i++){
            Product = Product*i;
        }
        return Product;
    }
    //main
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int Num = num.nextInt();
        int num_factorial = factorial(Num);
        System.out.println(num_factorial);
    }
}