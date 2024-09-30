import java.util.Scanner;
class SumofEvennums{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int M = num.nextInt();
        int N = num.nextInt();
        int Sum = 0;
        for(int i=M;i<=N;i++){
            if(i%2==0){
                Sum=Sum+i;
            }
        }
        System.out.println(Sum);
    }
}