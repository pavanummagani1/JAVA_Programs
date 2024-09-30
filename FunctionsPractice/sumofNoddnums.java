import java.util.Scanner;
class SumofNoddnums{
    public static int sumofOdd(int N){
        int Sum=0;
        for(int i =1; i<=N;i++){
            if(i%2!=0){
                Sum=Sum+i;
            }
        }
        return Sum;
    }
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int Num = num.nextInt();
        int result = sumofOdd(Num);
        System.out.println(result);
    }
}