import java.util.Scanner;
class Sumoftwonums{
    //Function
    public static int sum(int n1, int n2){
        int Sum = n1+n2;
        return Sum;
    }
    //main 
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int A = num.nextInt();
        int B = num.nextInt();
        int result = sum(A, B);
        System.out.println(result);
    }
}