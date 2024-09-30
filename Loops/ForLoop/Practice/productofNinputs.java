import java.util.Scanner;
class Productofninputs{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();;
        int product = 1;
        for(int i=1;i<=N;i++){
            int M = num.nextInt();
            product = product*i;
        }
        System.out.println(product);
    }
}